package com.example.doctorapp.data.remote.dto.request

data class VisitsRequestDto(
    val patientFiscalCode: String,
    val page: Int,
    val size: Int,
)