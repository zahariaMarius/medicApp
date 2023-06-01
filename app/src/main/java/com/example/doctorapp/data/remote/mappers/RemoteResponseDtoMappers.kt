package com.example.doctorapp.data.remote.mappers

import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.data.remote.dto.response.RemoteResponseDto
import com.example.doctorapp.domain.model.Doctor
import com.example.doctorapp.domain.model.PageableResultImpl
import com.example.doctorapp.domain.model.ResultImpl

fun <T : Any?> RemoteResponseDto<T>.toResult(): ResultImpl<T> {
    return ResultImpl(
        items = resultDto.items,
        message = resultDto.message,
        errMessage = resultDto.errMessage
    )
}

fun <T : Any?> RemoteResponseDto<T>.toPageableResult(): PageableResultImpl<T> {
    return PageableResultImpl(
        items = resultDto.items,
        message = resultDto.message,
        errMessage = resultDto.errMessage,
        currentPage = resultDto.currentPage!!,
        totalItems = resultDto.totalItems!!,
        totalPages = resultDto.totalPages!!
    )
}

fun DoctorDto.toDoctor(): Doctor {
    return Doctor(
        name = name,
        surname = surname,
        email = email,
        gender = gender,
        fiscalCode = fiscalCode,
        birthdayDate = birthdayDate,
        regionalCode = regionalCode,
        ASL = ASL
    )
}