package com.example.fastwritingserver.auth

class SecurityConstants {
    companion object {
        const val SECRET = "nyasbasamplesecret"
        const val EXPIRATION_TIME: Long = 28800000
        const val AUTH_HEADER = "Authorization"
        const val TOKEN_PREFIX = "Bearer "
    }
}