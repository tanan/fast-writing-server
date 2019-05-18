package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.Lesson

interface LessonRepository {
    fun findAll(): List<Lesson>

    fun find(id: Int): Lesson
}