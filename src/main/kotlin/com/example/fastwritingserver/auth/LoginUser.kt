package com.example.fastwritingserver.auth

import com.fasterxml.jackson.annotation.JsonProperty

data class LoginUser(
        @JsonProperty("username")
        val username: String,
        @JsonProperty("password")
        val password: String
)