package com.example.fastwritingserver.controller.request

import com.fasterxml.jackson.annotation.JsonCreator
import com.squareup.moshi.Json

data class LessonRegisterRequest @JsonCreator constructor(
        val title: String,
        val description: String
)

data class LessonContentRegisterRequest @JsonCreator constructor(
        val id: Int?,
        @field:Json(name = "jp_text")
        val japaneseText: String,
        @field:Json(name = "en_text")
        val englishText: String
)