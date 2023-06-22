package com.example.doctorapp.data.local.entity

import androidx.room.PrimaryKey

data class AddressEntity(
    val state: String,
    val city: String,
    val province: String,
    val address: String,
    @PrimaryKey
    val zipCode: Long
)
