package com.example.doctorapp.domain.model

interface Result<T> {
    val items: List<T>
    val message: String
    val errMessage: String
}