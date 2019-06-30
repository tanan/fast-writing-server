package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.Content

interface ContentsRepository {
    fun findAll(): List<Content>

    fun find(id: Int): Content

    fun findByLessonID(id: Int): List<Content>

    fun create(lessonId: Int, content: Content): Content
}