package com.example.fastwritingserver.model

data class Lesson(
        val id: Int,
        val title: String,
        val contents: List<Content>
)