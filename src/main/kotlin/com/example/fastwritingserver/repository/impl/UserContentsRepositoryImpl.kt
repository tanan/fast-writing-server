package com.example.fastwritingserver.repository.impl

import com.example.fastwritingserver.model.Content
import com.example.fastwritingserver.repository.UserContentsRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables.USER_DEFINED_CONTENTS
import spring.kotlin.jooq.generated.jooq.tables.records.UserDefinedContentsRecord

@Repository
class UserContentsRepositoryImpl(private val context: DSLContext): UserContentsRepository {
    override fun findByLessonID(id: Int): List<Content> {
        return context.select()
                .from(USER_DEFINED_CONTENTS)
                .where(USER_DEFINED_CONTENTS.USER_DEFINED_LESSON_ID.eq(id))
                .fetch()
                .map { toModel(it as UserDefinedContentsRecord) }
    }

    override fun create(lessonId: Int, content: Content): Content {
        return context.insertInto(USER_DEFINED_CONTENTS)
                .set(USER_DEFINED_CONTENTS.USER_DEFINED_LESSON_ID, lessonId)
                .set(USER_DEFINED_CONTENTS.JP_TEXT, content.japaneseText)
                .set(USER_DEFINED_CONTENTS.EN_TEXT, content.englishText)
                .returning()
                .fetchOne()
                .let { toModel(it) }
    }

    private fun toModel(r: UserDefinedContentsRecord): Content {
        return Content(r.id, r.jpText, r.enText)
    }
}