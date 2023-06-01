package com.example.doctorapp.domain.model

data class Address(
    val state: String,
    val city: String,
    val province: String,
    val address: String,
    val zipCode: Long
)