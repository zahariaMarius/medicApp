package com.example.doctorapp.data.remote.mappers

import com.example.doctorapp.data.local.entity.VisitEntity
import com.example.doctorapp.data.remote.dto.VisitDto
import com.example.doctorapp.domain.model.Visit

fun VisitDto.toVisitEntity(): VisitEntity {
    return VisitEntity(
        id = id,
        dateTime = dateTime,
        doctorName = doctor.name,
        doctorSurname = doctor.surname,
        doctorFiscalCode = doctor.fiscalCode,
        status = status,
        online = online,
        urlMeet = urlMeet
    )
}

fun VisitEntity.toVisit(): Visit {
    return Visit(
        id = id,
        dateTime = dateTime,
        doctorName = doctorName,
        doctorSurname = doctorSurname,
        doctorFiscalCode = doctorFiscalCode,
        status = status,
        online = online,
        urlMeet = urlMeet
    )
}