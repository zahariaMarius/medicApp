package com.example.doctorapp.domain.model

data class PageableResultImpl<T>(
    override val items: List<T>,
    override val message: String,
    override val errMessage: String,
    val currentPage: Int,
    val totalItems: Int,
    val totalPages: Int
) : Result<T>
