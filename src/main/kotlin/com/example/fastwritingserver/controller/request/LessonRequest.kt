package com.example.fastwritingserver.controller.request

import com.fasterxml.jackson.annotation.JsonCreator

data class LessonRegisterRequest @JsonCreator constructor(
        val title: String
)

data class LessonContentRegisterRequest @JsonCreator constructor(
        val japaneseText: String,
        val englishText: String
)