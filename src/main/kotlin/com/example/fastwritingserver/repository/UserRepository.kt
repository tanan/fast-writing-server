package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.User

interface UserRepository {
    fun findAll(): List<User>

    fun find(loginId: String): User

    fun findByUsername(username: String): User

    fun findByLoginId(loginId: String): User

    fun create(user: User): User
}