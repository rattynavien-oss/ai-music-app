package com.rattynavien.aimusicapp.data.repository

import com.rattynavien.aimusicapp.data.api.MusicApiService
import com.rattynavien.aimusicapp.data.api.MusicGenerationRequest
import com.rattynavien.aimusicapp.data.api.MusicGenerationResponse

class MusicRepository(private val apiService: MusicApiService) {
    private val apiKey = "YOUR_API_KEY_HERE" // Replace with actual API key

    suspend fun generateMusic(prompt: String): MusicGenerationResponse {
        val request = MusicGenerationRequest(
            prompt = prompt,
            duration = 30,
            style = "default"
        )
        return apiService.generateMusic(
            authorization = "Bearer $apiKey",
            request = request
        )
    }

    suspend fun checkStatus(id: String): String {
        return try {
            val response = apiService.getGenerationStatus(
                authorization = "Bearer $apiKey",
                id = id
            )
            response.status
        } catch (e: Exception) {
            "error"
        }
    }
}