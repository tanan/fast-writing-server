package com.example.fastwritingserver.controller

import com.example.fastwritingserver.service.LessonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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