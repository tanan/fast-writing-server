/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import spring.kotlin.jooq.generated.jooq.DefaultSchema;
import spring.kotlin.jooq.generated.jooq.Indexes;
import spring.kotlin.jooq.generated.jooq.Keys;
import spring.kotlin.jooq.generated.jooq.tables.records.UserDefinedContentsRecord;


/**
 * ミュージック
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDefinedContents extends TableImpl<UserDefinedContentsRecord> {

    private static final long serialVersionUID = 1817120488;

    /**
     * The reference instance of <code>user_defined_contents</code>
     */
    public static final UserDefinedContents USER_DEFINED_CONTENTS = new UserDefinedContents();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserDefinedContentsRecord> getRecordType() {
        return UserDefinedContentsRecord.class;
    }

    /**
     * The column <code>user_defined_contents.id</code>. id
     */
    public final TableField<UserDefinedContentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>user_defined_contents.user_defined_lesson_id</code>. lesson id
     */
    public final TableField<UserDefinedContentsRecord, Integer> USER_DEFINED_LESSON_ID = createField("user_defined_lesson_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "lesson id");

    /**
     * The column <code>user_defined_contents.jp_text</code>. japanese text
     */
    public final TableField<UserDefinedContentsRecord, String> JP_TEXT = createField("jp_text", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "japanese text");

    /**
     * The column <code>user_defined_contents.en_text</code>. english text
     */
    public final TableField<UserDefinedContentsRecord, String> EN_TEXT = createField("en_text", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "english text");

    /**
     * Create a <code>user_defined_contents</code> table reference
     */
    public UserDefinedContents() {
        this(DSL.name("user_defined_contents"), null);
    }

    /**
     * Create an aliased <code>user_defined_contents</code> table reference
     */
    public UserDefinedContents(String alias) {
        this(DSL.name(alias), USER_DEFINED_CONTENTS);
    }

    /**
     * Create an aliased <code>user_defined_contents</code> table reference
     */
    public UserDefinedContents(Name alias) {
        this(alias, USER_DEFINED_CONTENTS);
    }

    private UserDefinedContents(Name alias, Table<UserDefinedContentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserDefinedContents(Name alias, Table<UserDefinedContentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("ミュージック"));
    }

    public <O extends Record> UserDefinedContents(Table<O> child, ForeignKey<O, UserDefinedContentsRecord> key) {
        super(child, key, USER_DEFINED_CONTENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_DEFINED_CONTENTS_FK_USER_DEFINED_LESSON_ID, Indexes.USER_DEFINED_CONTENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserDefinedContentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_DEFINED_CONTENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserDefinedContentsRecord> getPrimaryKey() {
        return Keys.KEY_USER_DEFINED_CONTENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserDefinedContentsRecord>> getKeys() {
        return Arrays.<UniqueKey<UserDefinedContentsRecord>>asList(Keys.KEY_USER_DEFINED_CONTENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UserDefinedContentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UserDefinedContentsRecord, ?>>asList(Keys.FK_USER_DEFINED_LESSON_ID);
    }

    public UserDefinedLessons userDefinedLessons() {
        return new UserDefinedLessons(this, Keys.FK_USER_DEFINED_LESSON_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedContents as(String alias) {
        return new UserDefinedContents(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedContents as(Name alias) {
        return new UserDefinedContents(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserDefinedContents rename(String name) {
        return new UserDefinedContents(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserDefinedContents rename(Name name) {
        return new UserDefinedContents(name, null);
    }
}
