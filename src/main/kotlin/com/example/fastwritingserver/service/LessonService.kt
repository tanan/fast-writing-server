package com.example.fastwritingserver.service

import com.example.fastwritingserver.model.Content
import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.repository.ContentsRepository
import com.example.fastwritingserver.repository.LessonRepository
import com.example.fastwritingserver.repository.UserContentsRepository
import com.example.fastwritingserver.repository.UserLessonRepository
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LessonService(
        private val lessonRepository: LessonRepository, private val contentsRepository: ContentsRepository,
        private val userLessonRepository: UserLessonRepository, private val userContentsRepository: UserContentsRepository
) {
    @Transactional
    fun getAll() : String {
        val moshi = Moshi.Builder().build()
        val type = Types.newParameterizedType(List::class.java,Lesson::class.java)
        val listAdapter:JsonAdapter<List<Lesson>> = moshi.adapter(type)
        return listAdapter.toJson(lessonRepository.findAll())
    }

    @Transactional
    fun getAll(userId: Int) : String {
        val moshi = Moshi.Builder().build()
        val type = Types.newParameterizedType(List::class.java,Lesson::class.java)
        val listAdapter:JsonAdapter<List<Lesson>> = moshi.adapter(type)
        return listAdapter.toJson(userLessonRepository.findAll(userId))
    }

    @Transactional
    fun get(id: Int) : String {
        val lesson = lessonRepository.find(id)
        val contents = contentsRepository.findByLessonID(lesson.id)
        return toJson(lesson, contents)
    }

    @Transactional
    fun get(id: Int, userId: Int): String {
        val lesson = userLessonRepository.find(id, userId)
        val contents = userContentsRepository.findByLessonId(lesson.id)
        return toJson(lesson, contents)
    }

    @Transactional
    fun create(lesson: Lesson) : String {
        val lessonWithId = lessonRepository.create(lesson)
        return toJson(lessonWithId, listOf())
    }

    @Transactional
    fun create(userId: Int, lesson: Lesson): String {
        val lessonWithId = userLessonRepository.create(userId, lesson)
        return toJson(lessonWithId, listOf())
    }

    @Transactional
    fun createContent(lessonId: Int, content: Content): String {
        val contentWithId = contentsRepository.create(lessonId, content)
        return toJson(contentWithId)
    }

    @Transactional
    fun createUserContent(id: Int?, lessonId: Int, content: Content): String {
        val contentWithId = id?.let { userContentsRepository.update(lessonId, content) } ?: userContentsRepository.create(lessonId, content)
        return "OK"
    }

    fun list(id: Int) : String {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(Lesson::class.java)
        return adapter.toJson(lessonRepository.find(id))
    }

    private fun toJson(lesson: Lesson, contents: List<Content>): String {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(Lesson::class.java)
        return adapter.toJson(Lesson(lesson.id, lesson.title, lesson.description, contents))
    }

    private fun toJson(content: Content): String {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(Content::class.java)
        return adapter.toJson(content)
    }
}