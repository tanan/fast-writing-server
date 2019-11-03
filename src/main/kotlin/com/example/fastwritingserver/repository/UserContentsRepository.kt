package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.Content

interface UserContentsRepository {
    fun findByLessonID(id: Int): List<Content>

    fun create(lessonId: Int, content: Content): Content
}