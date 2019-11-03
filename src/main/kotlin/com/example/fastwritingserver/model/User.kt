package com.example.fastwritingserver.model

data class User(
        val id: Int?,
        val loginId: String,
        val password: String,
        val username: String
)

data class UserResponse(
        val loginId: String,
        val username: String
)