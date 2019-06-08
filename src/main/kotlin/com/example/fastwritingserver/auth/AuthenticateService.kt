package com.example.fastwritingserver.auth

import com.example.fastwritingserver.model.User
import com.example.fastwritingserver.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component

@Component
class AuthenticateService(private val repository: UserRepository): UserDetailsService {
    @Autowired
    lateinit var securityConfig: SecurityConfig

    override fun loadUserByUsername(username: String?): UserDetails = load(username)

    private fun load(username: String?): UserDetail =
        username?.let { repository.findByLoginId(it) }
                ?.let { UserDetail(it.id!!, it.loginId, it.password) } ?: UserDetail.empty

    fun create(user: User): Unit {
        repository.create(User(null, user.username, securityConfig.encoder().encode(user.password), user.username))
    }
}