package com.example.fastwritingserver.controller

import com.example.fastwritingserver.auth.AuthenticateService
import com.example.fastwritingserver.controller.request.UserRegisterRequest
import com.example.fastwritingserver.model.User
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:5001"], allowCredentials = "true")
@RequestMapping("/user")
class UserController(val authenticateService: AuthenticateService) {
    @PostMapping("/register", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun signUp(@RequestBody request: UserRegisterRequest): String {
        authenticateService.create(User(null, request.username, request.password, request.username))
        return "test"
    }
}