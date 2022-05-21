package com.example.domain.model

import com.sun.net.httpserver.Authenticator
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val user: User? = null,
    val message: String? = null
)
