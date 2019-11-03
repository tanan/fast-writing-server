package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.Lesson

interface UserLessonRepository {
    fun findAll(userId: Int): List<Lesson>

    fun find(id: Int, userId: Int): Lesson

    fun create(userId: Int, lesson: Lesson): Lesson
}