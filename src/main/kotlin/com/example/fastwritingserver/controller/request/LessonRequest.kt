package com.example.fastwritingserver.controller.request

import com.squareup.moshi.Json

data class LessonRegisterRequest(
        val title: String
)

data class LessonContentRegisterRequest(
        val id: Int,
        @field:Json(name = "jp_text")
        val japaneseText: String,
        @field:Json(name = "en_text")
        val englishText: String
)