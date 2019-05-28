package com.example.fastwritingserver.controller

import com.example.fastwritingserver.service.LessonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("lessons")
class LessonController(private val lessonService: LessonService) {
    @GetMapping("")
    fun get(): String {
        return lessonService.getAll()
    }

    @CrossOrigin(origins = ["http://localhost:5001"], allowCredentials = "true")
    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Int): String {
        return lessonService.get(id)
    }
}