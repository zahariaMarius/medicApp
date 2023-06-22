package com.example.doctorapp.data.remote.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.doctorapp.data.remote.dto.request.DoctorRequestDto
import com.example.doctorapp.data.remote.mappers.response.toDoctor
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.repository.DoctorRepository
import java.lang.Exception

class DoctorPagingSource(
    private val doctorRepository: DoctorRepository
) : PagingSource<Int, Doctor>() {

    override fun getRefreshKey(state: PagingState<Int, Doctor>): Int? {
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Doctor> {
        return try {
            val page = params.key ?: 0

            val response = doctorRepository.getDoctors(
                DoctorRequestDto(
                    page = page,
                    size = 5
                )
            )

            LoadResult.Page(
                data = response.resultDto.items.map { doctorDto ->
                    doctorDto.toDoctor()
                },
                prevKey = if (page == 0) null else page.minus(1),
                nextKey = if (
                    response.resultDto.totalPages == response.resultDto.currentPage?.plus(1)
                ) {
                    null
                } else {
                    response.resultDto.currentPage?.plus(1)
                }
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

}