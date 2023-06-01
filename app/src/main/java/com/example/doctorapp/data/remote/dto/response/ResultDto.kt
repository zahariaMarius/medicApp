package com.example.doctorapp.data.remote.dto.response

data class ResultDto<T>(
    val items: List<T>,
    val message: String,
    val errMessage: String,
    val currentPage: Int?,
    val totalItems: Int?,
    val totalPages: Int?
)