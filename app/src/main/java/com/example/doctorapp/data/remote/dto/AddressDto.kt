package com.example.doctorapp.data.remote.dto

data class AddressDto(
    val state: String,
    val city: String,
    val province: String,
    val address: String,
    val zipCode: Long
)