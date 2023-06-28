package com.example.doctorapp.data.remote.mediators

import android.util.Log
import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingSource
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.paging.log
import androidx.room.withTransaction
import com.example.doctorapp.data.local.database.DoctorDatabase
import com.example.doctorapp.data.local.database.VisitDatabase
import com.example.doctorapp.data.local.entity.RemoteKeyEntity
import com.example.doctorapp.data.local.entity.VisitEntity
import com.example.doctorapp.data.remote.api.VisitApi
import com.example.doctorapp.data.remote.dto.request.VisitsRequestDto
import com.example.doctorapp.data.remote.mappers.toVisitEntity
import com.example.doctorapp.domain.model.Patient
import com.example.doctorapp.domain.repository.VisitRepository

@OptIn(ExperimentalPagingApi::class)
class VisitRemoteMediator(
    private val visitDatabase: VisitDatabase,
    private val visitRepository: VisitRepository,
    private val patientFiscalCode: String
) : RemoteMediator<Int, VisitEntity>() {

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, VisitEntity>
    ): MediatorResult {

        return try {
            val loadKey = when (loadType) {
                LoadType.REFRESH -> {
                    val remoteKeys = getRemoteKeyClosestToCurrentPosition(state)
                    remoteKeys?.nextPage?.minus(1) ?: 0
                }

                LoadType.PREPEND -> {
                    val remoteKeys = getRemoteKeyForFirstItem(state)
                    val prevPage = remoteKeys?.prevPage
                        ?: return MediatorResult.Success(
                            endOfPaginationReached = remoteKeys != null
                        )
                    prevPage
                }

                LoadType.APPEND -> {
                    val remoteKeys = getRemoteKeyForLastItem(state)
                    val nextPage = remoteKeys?.nextPage
                        ?: return MediatorResult.Success(
                            endOfPaginationReached = remoteKeys != null
                        )
                    nextPage
                }
            }
            val remoteVisits = visitRepository.getVisits(
                VisitsRequestDto(
                    patientFiscalCode = patientFiscalCode,
                    page = loadKey,
                    size = state.config.pageSize
                )
            )
            val endOfPaginationReached = remoteVisits.resultDto.items.isEmpty()

            val prevPage = if (loadKey == 0) null else loadKey - 1
            val nextPage = if (endOfPaginationReached) null else loadKey + 1

            visitDatabase.withTransaction {
                if (loadType == LoadType.REFRESH) {
                    visitDatabase.visitDao.clearAll()
                    visitDatabase.remoteKeyDao.clearAll()
                }
                val visitEntities = remoteVisits.resultDto.items.map { it.toVisitEntity() }
                val remoteKeyEntities = visitEntities.map { visitEntity ->
                    RemoteKeyEntity(
                        id = visitEntity.id,
                        prevPage = prevPage,
                        nextPage = nextPage
                    )
                }

                Log.d("LISTA DI VISITE", visitEntities.toString())
                visitDatabase.visitDao.insertAll(visitEntities)
                visitDatabase.remoteKeyDao.insertOrReplace(remoteKeyEntities)
            }

            MediatorResult.Success(endOfPaginationReached = endOfPaginationReached)

        } catch (e: Exception) {
            MediatorResult.Error(e)
        }

    }

    private suspend fun getRemoteKeyClosestToCurrentPosition(
        state: PagingState<Int, VisitEntity>
    ): RemoteKeyEntity? {
        return state.anchorPosition?.let { position ->
            state.closestItemToPosition(position)?.id?.let { id ->
                visitDatabase.remoteKeyDao.remoteKeyByQuery(id = id)
            }
        }
    }

    private suspend fun getRemoteKeyForFirstItem(
        state: PagingState<Int, VisitEntity>
    ): RemoteKeyEntity? {
        return state.pages.firstOrNull { it.data.isNotEmpty() }?.data?.firstOrNull()
            ?.let { visitEntity ->
                visitDatabase.remoteKeyDao.remoteKeyByQuery(id = visitEntity.id)
            }
    }

    private suspend fun getRemoteKeyForLastItem(
        state: PagingState<Int, VisitEntity>
    ): RemoteKeyEntity? {
        return state.pages.lastOrNull { it.data.isNotEmpty() }?.data?.lastOrNull()
            ?.let { visitEntity ->
                visitDatabase.remoteKeyDao.remoteKeyByQuery(id = visitEntity.id)
            }
    }
}
