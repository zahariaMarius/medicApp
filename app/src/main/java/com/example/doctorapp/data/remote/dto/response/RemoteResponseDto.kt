package com.example.doctorapp.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class RemoteResponseDto<T>(
    val result: List<T>,
    val message: String,
    val errMessage: String,
    val currentPage: Int?,
    val totalItems: Int?,
    val totalPages: Int?
)