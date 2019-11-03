package com.example.fastwritingserver.repository.impl

import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.repository.UserLessonRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables.USER_DEFINED_LESSONS
import spring.kotlin.jooq.generated.jooq.tables.records.UserDefinedLessonsRecord

@Repository
class UserLessonRepository(private val context: DSLContext) : UserLessonRepository {
    override fun findAll(userId: Int): List<Lesson> {
        return context.select()
                .from(USER_DEFINED_LESSONS)
                .where(USER_DEFINED_LESSONS.USER_ID.eq(userId))
                .fetch()
                .map { toModel(it as UserDefinedLessonsRecord) }
    }

    override fun find(id: Int, userId: Int): Lesson {
        return context.select()
                .from(USER_DEFINED_LESSONS)
                .where(USER_DEFINED_LESSONS.ID.eq(id))
                .and(USER_DEFINED_LESSONS.USER_ID.eq(userId))
                .fetchOne()
                .map { toModel(it as UserDefinedLessonsRecord) }
    }

    override fun create(userId: Int, lesson: Lesson): Lesson {
        return context.insertInto(USER_DEFINED_LESSONS)
                .set(USER_DEFINED_LESSONS.USER_ID, userId)
                .set(USER_DEFINED_LESSONS.TITLE, lesson.title)
                .set(USER_DEFINED_LESSONS.DESCRIPTION, lesson.description)
                .returning()
                .fetchOne()
                .let { toModel(it) }
    }

    private fun toModel(r: UserDefinedLessonsRecord): Lesson {
        return Lesson(r.id, r.title, r.description, listOf())
    }
}