package com.example.fastwritingserver.controller

import com.example.fastwritingserver.auth.AuthenticateService
import com.example.fastwritingserver.auth.UserDetail
import com.example.fastwritingserver.controller.request.LessonContentRegisterRequest
import com.example.fastwritingserver.controller.request.LessonRegisterRequest
import com.example.fastwritingserver.controller.request.UserRegisterRequest
import com.example.fastwritingserver.model.Content
import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.model.User
import com.example.fastwritingserver.service.LessonService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:5001", "http://fast-writing.weeekend.work"], allowCredentials = "true")
@RequestMapping("/users")
class UserController(val authenticateService: AuthenticateService, val lessonService: LessonService) {
    @GetMapping("/{id}")
    fun get(@PathVariable(value = "id") id: String): ResponseEntity<String> {
        if (SecurityContextHolder.getContext().authentication.principal == id) {
            return ResponseEntity(authenticateService.get(id), null, HttpStatus.OK)
        }
        return ResponseEntity("User is mismatch. principal: " +
                Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())), null, HttpStatus.BAD_REQUEST)
    }

    @PostMapping("/register", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun signUp(@RequestBody request: UserRegisterRequest): String {
        return authenticateService.create(User(null, request.username, request.password, request.username))
    }

    @GetMapping("/{id}/lessons")
    fun get(@PathVariable(value = "id") id:Int): ResponseEntity<String> {
        if (Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())) == id) {
            return ResponseEntity(lessonService.getAll(id), null, HttpStatus.OK)
        }
        return ResponseEntity("User is mismatch. principal: " +
                Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())), null, HttpStatus.BAD_REQUEST)
    }

    @GetMapping("/{id}/lessons/{lessonId}")
    fun getLesson(@PathVariable(value = "id") id:Int, @PathVariable(value = "lessonId") lessonId: Int): ResponseEntity<String> {
        if (Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())) == id) {
            return ResponseEntity(lessonService.get(lessonId, id), null, HttpStatus.OK)
        }
        return ResponseEntity("User is mismatch. principal: " +
                Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())), null, HttpStatus.BAD_REQUEST)
    }

    @GetMapping("/{id}/lessons/{lessonId}/contents")
    fun getLessonContents(@PathVariable(value = "id") id:Int, @PathVariable(value = "lessonId") lessonId: Int): ResponseEntity<String> {
        if (Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())) == id) {
            return ResponseEntity(lessonService.get(lessonId, id), null, HttpStatus.OK)
        }
        return ResponseEntity("User is mismatch. principal: " +
                Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())), null, HttpStatus.BAD_REQUEST)
    }

    @PostMapping("/{id}/lessons", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun postLesson(@PathVariable(value = "id") id:Int, @RequestBody request: LessonRegisterRequest): ResponseEntity<String> {
        if (Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())) == id) {
            return ResponseEntity(
                    lessonService.create(
                            id, Lesson(request.id?.let { it } ?: 0, request.title, request.description, listOf())
                    ), null, HttpStatus.OK
            )
        }
        return ResponseEntity("User is mismatch. principal: " +
                Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())), null, HttpStatus.BAD_REQUEST)
    }

    @PostMapping("/{id}/lessons/{lessonId}/contents", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun postLessonContent(@PathVariable(value = "id") id:Int,
                          @PathVariable(value = "lessonId") lessonId: Int,
                          @RequestBody request: LessonContentRegisterRequest): ResponseEntity<String> {
        if (Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())) == id) {
            return ResponseEntity(
                    lessonService.createUserContent(
                            request.id, lessonId, Content(request.id?.let { it } ?: 0, request.japaneseText, request.englishText)
                    ), null, HttpStatus.OK
            )
        }
        return ResponseEntity("User is mismatch. principal: " +
                Integer.parseInt((SecurityContextHolder.getContext().authentication.principal.toString())), null, HttpStatus.BAD_REQUEST)
    }
}