package com.example.fastwritingserver.auth

import com.example.fastwritingserver.model.User
import com.example.fastwritingserver.repository.UserRepository
import com.squareup.moshi.Moshi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Lazy
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component

@Component
class AuthenticateService(private val repository: UserRepository): UserDetailsService {
    @Lazy
    @Autowired
    private lateinit var securityConfig: SecurityConfig

    override fun loadUserByUsername(username: String?): UserDetails = load(username)

    private fun load(username: String?): UserDetail =
        username?.let { repository.findByLoginId(it) }
                ?.let { UserDetail(it.id!!, it.loginId, it.password) } ?: UserDetail.empty

    fun create(user: User): String =
        toJson(repository.create(User(null, user.username, securityConfig.encoder().encode(user.password), user.username)))

    private fun toJson(user: User): String {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(User::class.java)
        return adapter.toJson(user)
    }
}