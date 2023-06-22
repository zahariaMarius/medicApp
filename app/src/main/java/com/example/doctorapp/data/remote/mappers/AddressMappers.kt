package com.example.doctorapp.data.remote.mappers

import com.example.doctorapp.data.local.entity.AddressEntity
import com.example.doctorapp.data.remote.dto.AddressDto
import com.example.doctorapp.domain.model.Address

fun AddressDto.toAddressEntity(): AddressEntity {
    return AddressEntity(
        state=state,
        city=city,
        province=province,
        address=address,
        zipCode=zipCode
    )
}

fun AddressEntity.toAddress(): Address {
    return Address(
        state=state,
        city=city,
        province=province,
        address=address,
        zipCode=zipCode
    )
}