package com.example.fastwritingserver.repository

import com.example.fastwritingserver.model.Contents

interface ContentsRepository {
    fun findAll(): List<Contents>

    fun find(id: Int): Contents

    fun findByLessonID(id: Int): List<Contents>
}