package com.example.fastwritingserver.controller

import com.example.fastwritingserver.auth.AuthenticateService
import com.example.fastwritingserver.controller.request.LessonRegisterRequest
import com.example.fastwritingserver.controller.request.UserRegisterRequest
import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.model.User
import com.example.fastwritingserver.service.LessonService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:5001", "http://fast-writing.weeekend.work"], allowCredentials = "true")
@RequestMapping("/users")
class UserController(val authenticateService: AuthenticateService, val lessonService: LessonService) {
    @GetMapping("/{id}")
    fun get(@PathVariable(value = "id") id: String): String {
        return authenticateService.get(id)
    }

    @PostMapping("/register", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun signUp(@RequestBody request: UserRegisterRequest): String {
        return authenticateService.create(User(null, request.username, request.password, request.username))
    }

    @GetMapping("/{id}/lessons")
    fun get(@PathVariable(value = "id") id:Int): String {
        return lessonService.getAll(id)
    }

    @GetMapping("/{id}/lessons/{lessonId}/contents")
    fun get(@PathVariable(value = "id") id:Int, @PathVariable(value = "lessonId") lessonId: Int): String {
        return lessonService.get(lessonId, id)
    }

    @PostMapping("/{id}/lessons/create", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun post(@PathVariable(value = "id") id:Int, @RequestBody request: LessonRegisterRequest): String {
        return lessonService.create(id, Lesson(0, request.title, request.description, listOf()))
    }
}