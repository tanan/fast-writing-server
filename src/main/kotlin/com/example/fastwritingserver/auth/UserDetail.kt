package com.example.fastwritingserver.auth

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class UserDetail(val id: Int,
                 private val username: String,
                 private val password: String,
                 private val authorities: List<GrantedAuthority> = listOf()): UserDetails {
    companion object {
        val empty: UserDetail = UserDetail(-1, "", "")
    }

    override fun getUsername(): String = username
    override fun getPassword(): String = password
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> = authorities.toMutableList()
    override fun isEnabled(): Boolean = true
    override fun isCredentialsNonExpired(): Boolean = true
    override fun isAccountNonExpired(): Boolean = true
    override fun isAccountNonLocked(): Boolean = true
}