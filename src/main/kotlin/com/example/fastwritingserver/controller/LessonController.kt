package com.example.fastwritingserver.controller

import com.example.fastwritingserver.service.LessonService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["http://localhost:5001"], allowCredentials = "true")
@RequestMapping("lessons")
class LessonController(private val lessonService: LessonService) {
    @GetMapping("")
    fun get(): String {

        return lessonService.getAll()
    }

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Int): String {
        return lessonService.get(id)
    }
}