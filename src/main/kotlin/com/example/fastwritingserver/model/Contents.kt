package com.example.fastwritingserver.model

import com.squareup.moshi.Json

data class Contents(
        val id: Int,
        @field:Json(name = "jp_text")
        val japaneseText: String,
        @field:Json(name = "en_text")
        val englishText: String
)