package com.example.doctorapp.data.remote.dto.request

import com.example.doctorapp.domain.model.Gender
import java.util.Date

data class DoctorRequestDto(
    val id: String? = null,
    val name: String? = null,
    val surname: String? = null,
    val email: String? = null,
    val fiscalCode: String? = null,
    val gender: Gender? = null,
    val birthdayDate: Date? = null,
    val regionalCode: String? = null,
    val ASL: String? = null,
    val size: Int? = null,
    val page: Int? = null
)