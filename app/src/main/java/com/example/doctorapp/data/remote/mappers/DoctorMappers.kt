package com.example.doctorapp.data.remote.mappers

import com.example.doctorapp.data.local.entity.DoctorEntity
import com.example.doctorapp.data.remote.dto.DoctorDto
import com.example.doctorapp.domain.model.Doctor

fun DoctorDto.toDoctorEntity(): DoctorEntity {
    return DoctorEntity(
        id=id,
        name=name,
        surname=surname,
        email=email,
        fiscalCode=fiscalCode,
        gender=gender,
        birthdayDate=birthdayDate,
        regionalCode=regionalCode,
        ASL=ASL
    )
}

fun DoctorEntity.toDoctor(): Doctor{
    return Doctor(
        name=name,
        surname=surname,
        email=email,
        fiscalCode=fiscalCode,
        gender= gender!!,
        birthdayDate=birthdayDate!!,
        regionalCode=regionalCode,
        ASL=ASL
    )
}