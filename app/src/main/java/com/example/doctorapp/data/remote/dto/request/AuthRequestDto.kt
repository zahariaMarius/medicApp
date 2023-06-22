package com.example.doctorapp.data.remote.dto.request

import com.example.doctorapp.domain.model.Address
import com.example.doctorapp.domain.model.Gender
import java.util.Date

data class AuthRequestDto(
    val email: String? = null,
    val password: String? = null
)