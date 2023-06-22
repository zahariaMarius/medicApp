//package com.example.doctorapp.data.remote.mediators
//
//import androidx.paging.ExperimentalPagingApi
//import androidx.paging.LoadType
//import androidx.paging.PagingState
//import androidx.paging.RemoteMediator
//import com.example.doctorapp.data.local.database.DoctorDatabase
//import com.example.doctorapp.data.local.entity.DoctorEntity
//import com.example.doctorapp.data.remote.api.DoctorApi
//import retrofit2.HttpException
//import java.io.IOException
//
//@OptIn(ExperimentalPagingApi::class)
//class DoctorRemoteMediator(
//    private val doctorDb: DoctorDatabase,
//    private val doctorApi: DoctorApi
//): RemoteMediator<Int, DoctorEntity>() {
//    override suspend fun load(
//        loadType: LoadType,
//        state: PagingState<Int, DoctorEntity>
//    ): MediatorResult {
//        return try{
//            val loadKey = when(loadType){
//                LoadType.REFRESH -> 0
//                LoadType.PREPEND -> return MediatorResult.Success(
//                    endOfPaginationReached = true
//                )
//                LoadType.APPEND -> {
//                    val lastItem = state.lastItemOrNull()
//                    if(lastItem==null){
//                        0 // eventualmente 1|null (return first page)
//                    }else{
//                        (lastItem.id / state.config.pageSize) +1
//                    }
//                }
//            }
//            val doctors = doctorApi.getDoctor()
//
//            doctorDb.withTransaction{
//                if(loadKey==LoadType.REFRESH){
//                    doctorDb.dao.clearAll()
//                }
//                val doctorEntities = doctors.map{it.toDoctorEntity()}
//                doctorDb.dao.upsertAll(doctorEntities)
//            }
//        }catch (e: IOException){
//            MediatorResult.Error(e)
//        }catch (e: HttpException){
//            MediatorResult.Error(e)
//        }
//    }
//}