package com.example.fastwritingserver.repository.impl

import com.example.fastwritingserver.model.Contents
import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.repository.ContentsRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables.CONTENTS
import spring.kotlin.jooq.generated.jooq.tables.records.ContentsRecord

@Repository
class ContentsRepositoryImpl(private val context: DSLContext) : ContentsRepository {
    override fun findAll(): List<Contents> {
        return context.select()
                .from(CONTENTS)
                .fetch()
                .map { toModel(it as ContentsRecord) }
    }

    override fun find(id: Int): Contents {
        return context.select()
                .from(CONTENTS)
                .where(CONTENTS.ID.eq(id))
                .fetchOne()
                .map { toModel(it as ContentsRecord) }
    }

    override fun findByLessonID(id: Int): List<Contents> {
        return context.select()
                .from(CONTENTS)
                .where(CONTENTS.LESSON_ID.eq(id))
                .fetch()
                .map { toModel(it as ContentsRecord) }
    }

    override fun create(lessonId: Int, contents: Contents): Contents {
        return context.insertInto(CONTENTS)
                .set(CONTENTS.LESSON_ID, lessonId)
                .set(CONTENTS.EN_TEXT, contents.englishText)
                .set(CONTENTS.JP_TEXT, contents.japaneseText)
                .returning()
                .fetchOne()
                .let { toModel(it) }
    }

    private fun toModel(r: ContentsRecord) : Contents {
        return Contents(r.id, r.jpText, r.enText)
    }
}