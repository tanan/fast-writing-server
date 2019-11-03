package com.example.fastwritingserver.controller

import com.example.fastwritingserver.auth.AuthenticateService
import com.example.fastwritingserver.controller.request.UserRegisterRequest
import com.example.fastwritingserver.model.User
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:5001", "http://fast-writing.weeekend.work"], allowCredentials = "true")
@RequestMapping("/user")
class UserController(val authenticateService: AuthenticateService) {
    @GetMapping("/{id}")
    fun get(@PathVariable(value = "id") id: String): String {
        return authenticateService.get(id)
    }

    @PostMapping("/register", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun signUp(@RequestBody request: UserRegisterRequest): String {
        return authenticateService.create(User(null, request.username, request.password, request.username))
    }
}