package com.example.fastwritingserver.repository.impl

import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.repository.LessonRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables.LESSON
import spring.kotlin.jooq.generated.jooq.tables.records.LessonRecord

@Repository
class LessonRepositoryImpl(private val context: DSLContext) : LessonRepository {
    override fun findAll(): List<Lesson> {
        return context.select()
                .from(LESSON)
                .fetch()
                .map { toModel(it as LessonRecord) }
    }

    override fun find(id: Int): Lesson {
        return context.select()
                .from(LESSON)
                .where(LESSON.ID.eq(id))
                .fetchOne()
                .map { toModel(it as LessonRecord) }
    }

    override fun create(lesson: Lesson): Lesson {
        return context.insertInto(LESSON)
                .set(LESSON.TITLE, lesson.title)
                .returning()
                .fetchOne()
                .let { toModel(it) }
    }

    private fun toModel(r: LessonRecord): Lesson {
        return Lesson(r.id, r.title, listOf())
    }
}