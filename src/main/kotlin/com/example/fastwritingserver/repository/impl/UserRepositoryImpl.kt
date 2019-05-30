package com.example.fastwritingserver.repository.impl


import com.example.fastwritingserver.model.User
import com.example.fastwritingserver.repository.UserRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables
import spring.kotlin.jooq.generated.jooq.tables.records.UsersRecord

@Repository
class UserRepositoryImpl(private val context: DSLContext) : UserRepository {
    override fun findAll(): List<User> {
        return context.select()
                .from(Tables.USERS)
                .fetch()
                .map { toModel(it as UsersRecord) }
    }

    override fun find(loginId: String): User {
        return context.select()
                .from(Tables.USERS)
                .where(Tables.USERS.LOGIN_ID.eq(loginId))
                .fetchOne()
                .map { toModel(it as UsersRecord) }
    }

    private fun toModel(r: UsersRecord): User {
        return User(r.id, r.loginId, r.password)
    }
}