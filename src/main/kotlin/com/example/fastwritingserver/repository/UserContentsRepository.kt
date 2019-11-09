package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.Content

interface UserContentsRepository {
    fun findByLessonId(id: Int): List<Content>

    fun findByIdAndLessonId(id: Int, lessonId: Int): Content

    fun create(lessonId: Int, content: Content): Content

    fun update(lessonId: Int, content: Content)
}