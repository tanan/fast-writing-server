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

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Int): String {
        return lessonService.get(id)
    }
}