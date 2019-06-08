package com.example.fastwritingserver.service

import com.example.fastwritingserver.model.User
import com.example.fastwritingserver.repository.UserRepository
import com.squareup.moshi.Moshi
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
        private val userRepository: UserRepository
) {
    @Transactional
    fun findByLoginId(loginId: String) : String {
        val user = userRepository.find(loginId)
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(User::class.java)
        return adapter.toJson(User(user.id, user.loginId, "", ""))
    }
}