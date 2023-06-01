package com.example.doctorapp.domain.model

data class ResultImpl<T>(
    override val items: List<T>,
    override val message: String,
    override val errMessage: String
): Result<T>
