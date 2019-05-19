package com.example.fastwritingserver.service

import com.example.fastwritingserver.model.Lesson
import com.example.fastwritingserver.repository.ContentsRepository
import com.example.fastwritingserver.repository.LessonRepository
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LessonService(
        private val lessonRepository: LessonRepository, private val contentsRepository: ContentsRepository
) {
    @Transactional
    fun getAll() : String {
        val moshi = Moshi.Builder().build()
        val type = Types.newParameterizedType(List::class.java,Lesson::class.java)
        val listAdapter:JsonAdapter<List<Lesson>> = moshi.adapter(type)
        return listAdapter.toJson(lessonRepository.findAll())
    }

    @Transactional
    fun get(id: Int) : String {
        val lesson = lessonRepository.find(id)
        val contents = contentsRepository.findByLessonID(lesson.id)
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(Lesson::class.java)
        return adapter.toJson(Lesson(lesson.id, lesson.title, contents))
    }

    fun list(id: Int) : String {
        val moshi = Moshi.Builder().build()
        val adapter = moshi.adapter(Lesson::class.java)
        return adapter.toJson(lessonRepository.find(id))
    }
}