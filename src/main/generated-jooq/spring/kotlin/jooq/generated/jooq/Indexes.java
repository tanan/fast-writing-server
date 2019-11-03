/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;

import spring.kotlin.jooq.generated.jooq.tables.Contents;
import spring.kotlin.jooq.generated.jooq.tables.Lessons;
import spring.kotlin.jooq.generated.jooq.tables.UserDefinedContents;
import spring.kotlin.jooq.generated.jooq.tables.UserDefinedLessons;
import spring.kotlin.jooq.generated.jooq.tables.Users;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CONTENTS_FK_LESSON_ID = Indexes0.CONTENTS_FK_LESSON_ID;
    public static final Index CONTENTS_PRIMARY = Indexes0.CONTENTS_PRIMARY;
    public static final Index LESSONS_PRIMARY = Indexes0.LESSONS_PRIMARY;
    public static final Index USERS_PRIMARY = Indexes0.USERS_PRIMARY;
    public static final Index USER_DEFINED_CONTENTS_FK_USER_DEFINED_LESSON_ID = Indexes0.USER_DEFINED_CONTENTS_FK_USER_DEFINED_LESSON_ID;
    public static final Index USER_DEFINED_CONTENTS_PRIMARY = Indexes0.USER_DEFINED_CONTENTS_PRIMARY;
    public static final Index USER_DEFINED_LESSONS_FK_USER_ID = Indexes0.USER_DEFINED_LESSONS_FK_USER_ID;
    public static final Index USER_DEFINED_LESSONS_PRIMARY = Indexes0.USER_DEFINED_LESSONS_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CONTENTS_FK_LESSON_ID = Internal.createIndex("fk_lesson_id", Contents.CONTENTS, new OrderField[] { Contents.CONTENTS.LESSON_ID }, false);
        public static Index CONTENTS_PRIMARY = Internal.createIndex("PRIMARY", Contents.CONTENTS, new OrderField[] { Contents.CONTENTS.ID }, true);
        public static Index LESSONS_PRIMARY = Internal.createIndex("PRIMARY", Lessons.LESSONS, new OrderField[] { Lessons.LESSONS.ID }, true);
        public static Index USERS_PRIMARY = Internal.createIndex("PRIMARY", Users.USERS, new OrderField[] { Users.USERS.ID }, true);
        public static Index USER_DEFINED_CONTENTS_FK_USER_DEFINED_LESSON_ID = Internal.createIndex("fk_user_defined_lesson_id", UserDefinedContents.USER_DEFINED_CONTENTS, new OrderField[] { UserDefinedContents.USER_DEFINED_CONTENTS.USER_DEFINED_LESSON_ID }, false);
        public static Index USER_DEFINED_CONTENTS_PRIMARY = Internal.createIndex("PRIMARY", UserDefinedContents.USER_DEFINED_CONTENTS, new OrderField[] { UserDefinedContents.USER_DEFINED_CONTENTS.ID }, true);
        public static Index USER_DEFINED_LESSONS_FK_USER_ID = Internal.createIndex("fk_user_id", UserDefinedLessons.USER_DEFINED_LESSONS, new OrderField[] { UserDefinedLessons.USER_DEFINED_LESSONS.USER_ID }, false);
        public static Index USER_DEFINED_LESSONS_PRIMARY = Internal.createIndex("PRIMARY", UserDefinedLessons.USER_DEFINED_LESSONS, new OrderField[] { UserDefinedLessons.USER_DEFINED_LESSONS.ID }, true);
    }
}
