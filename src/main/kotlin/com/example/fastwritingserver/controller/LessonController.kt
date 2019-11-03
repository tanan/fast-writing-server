package com.example.fastwritingserver.controller

import com.example.fastwritingserver.controller.request.LessonContentRegisterRequest
import com.example.fastwritingserver.controller.request.LessonRegisterRequest
import com.example.fastwritingserver.model.Content
import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.service.LessonService
import org.springframework.http.MediaType
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:5001", "http://fast-writing.weeekend.work"], allowCredentials = "true")
@RequestMapping("lessons")
class LessonController(private val lessonService: LessonService) {
    @GetMapping("")
    fun getAll(): String {
        return lessonService.getAll()
    }

    @GetMapping("/{id}")
    fun getLesson(@PathVariable("id") id: Int): String {
        return lessonService.get(id)
    }

    @GetMapping("/{id}/contents")
    fun get(@PathVariable("id") id: Int): String {
        return lessonService.get(id)
    }

    @PostMapping("/{id}/contents")
    fun postContent(@PathVariable("id") lessonId: Int,
                    @RequestBody request: LessonContentRegisterRequest): String {
        return lessonService.createContent(lessonId, Content(0, request.japaneseText, request.englishText))
    }

    @PostMapping("/create", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun post(@RequestBody request: LessonRegisterRequest): String {
        return lessonService.create(Lesson(0, request.title, request.description, listOf()))
    }
}