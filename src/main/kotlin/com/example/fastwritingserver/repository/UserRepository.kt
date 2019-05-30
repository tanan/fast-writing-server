package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.User

interface UserRepository {
    fun findAll(): List<User>

    fun find(loginId: String): User
}