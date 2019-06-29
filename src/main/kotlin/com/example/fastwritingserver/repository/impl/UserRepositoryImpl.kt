package com.example.fastwritingserver.repository.impl


import com.example.fastwritingserver.model.User
import com.example.fastwritingserver.repository.UserRepository
import org.jooq.DSLContext
import org.springframework.stereotype.Repository
import spring.kotlin.jooq.generated.jooq.Tables.USERS
import spring.kotlin.jooq.generated.jooq.tables.records.UsersRecord

@Repository
class UserRepositoryImpl(private val context: DSLContext) : UserRepository {
    override fun findAll(): List<User> {
        return context.select()
                .from(USERS)
                .fetch()
                .map { toModel(it as UsersRecord) }
    }

    override fun find(loginId: String): User {
        return context.select()
                .from(USERS)
                .where(USERS.LOGIN_ID.eq(loginId))
                .fetchOne()
                .map { toModel(it as UsersRecord) }
    }

    override fun findByUsername(username: String): User {
        return context.select()
                .from(USERS)
                .where(USERS.LOGIN_ID.eq(username))
                .fetchOne()
                .map { toModel(it as UsersRecord) }
    }

    override fun findByLoginId(loginId: String): User {
        println(loginId)
        return context.select()
                .from(USERS)
                .where(USERS.LOGIN_ID.eq(loginId))
                .fetchOne()
                .map { toModel(it as UsersRecord) }
    }

    override fun create(user: User): User {
        return context.insertInto(USERS)
                .set(USERS.LOGIN_ID, user.loginId)
                .set(USERS.PASSWORD, user.password)
                .returning()
                .fetchOne()
                .let { toModel(it) }
    }

    private fun toModel(r: UsersRecord): User {
        return User(r.id, r.loginId, r.password, "")
    }
}