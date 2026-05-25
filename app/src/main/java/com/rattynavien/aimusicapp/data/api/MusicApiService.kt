package com.rattynavien.aimusicapp.data.api

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body
import retrofit2.http.Header

interface MusicApiService {
    @POST("generate")
    suspend fun generateMusic(
        @Header("Authorization") authorization: String,
        @Body request: MusicGenerationRequest
    ): MusicGenerationResponse

    @GET("status/{id}")
    suspend fun getGenerationStatus(
        @Header("Authorization") authorization: String,
        @Body id: String
    ): StatusResponse
}

data class MusicGenerationRequest(
    val prompt: String,
    val duration: Int = 30,
    val style: String = "default"
)

data class MusicGenerationResponse(
    val id: String,
    val status: String,
    val prompt: String,
    val url: String? = null
)

data class StatusResponse(
    val id: String,
    val status: String,
    val url: String? = null
)