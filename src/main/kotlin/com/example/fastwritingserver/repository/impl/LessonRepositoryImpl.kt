package com.example.fastwritingserver.repository.impl

import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.repository.LessonRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables.LESSONS
import spring.kotlin.jooq.generated.jooq.tables.records.LessonsRecord

@Repository
class LessonRepositoryImpl(private val context: DSLContext) : LessonRepository {
    override fun findAll(): List<Lesson> {
        return context.select()
                .from(LESSONS)
                .fetch()
                .map { toModel(it as LessonsRecord) }
    }

    override fun find(id: Int): Lesson {
        return context.select()
                .from(LESSONS)
                .where(LESSONS.ID.eq(id))
                .fetchOne()
                .map { toModel(it as LessonsRecord) }
    }

    override fun create(lesson: Lesson): Lesson {
        return context.insertInto(LESSONS)
                .set(LESSONS.TITLE, lesson.title)
                .set(LESSONS.DESCRIPTION, lesson.description)
                .returning()
                .fetchOne()
                .let { toModel(it) }
    }

    private fun toModel(r: LessonsRecord): Lesson {
        return Lesson(r.id, r.title, r.description, listOf())
    }
}