package com.example.doctorapp.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class RemoteResponseDto<T>(
    @SerializedName("result")
    val resultDto: ResultDto<T>
)