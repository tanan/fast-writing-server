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
import spring.kotlin.jooq.generated.jooq.tables.records.LessonRecord;


/**
 * lesson
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Lesson extends TableImpl<LessonRecord> {

    private static final long serialVersionUID = 1047176263;

    /**
     * The reference instance of <code>lesson</code>
     */
    public static final Lesson LESSON = new Lesson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LessonRecord> getRecordType() {
        return LessonRecord.class;
    }

    /**
     * The column <code>lesson.id</code>. id
     */
    public final TableField<LessonRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "id");

    /**
     * The column <code>lesson.title</code>. タイトル
     */
    public final TableField<LessonRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "タイトル");

    /**
     * The column <code>lesson.description</code>. 説明
     */
    public final TableField<LessonRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "説明");

    /**
     * Create a <code>lesson</code> table reference
     */
    public Lesson() {
        this(DSL.name("lesson"), null);
    }

    /**
     * Create an aliased <code>lesson</code> table reference
     */
    public Lesson(String alias) {
        this(DSL.name(alias), LESSON);
    }

    /**
     * Create an aliased <code>lesson</code> table reference
     */
    public Lesson(Name alias) {
        this(alias, LESSON);
    }

    private Lesson(Name alias, Table<LessonRecord> aliased) {
        this(alias, aliased, null);
    }

    private Lesson(Name alias, Table<LessonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("lesson"));
    }

    public <O extends Record> Lesson(Table<O> child, ForeignKey<O, LessonRecord> key) {
        super(child, key, LESSON);
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
        return Arrays.<Index>asList(Indexes.LESSON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LessonRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LESSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LessonRecord> getPrimaryKey() {
        return Keys.KEY_LESSON_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LessonRecord>> getKeys() {
        return Arrays.<UniqueKey<LessonRecord>>asList(Keys.KEY_LESSON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lesson as(String alias) {
        return new Lesson(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lesson as(Name alias) {
        return new Lesson(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Lesson rename(String name) {
        return new Lesson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Lesson rename(Name name) {
        return new Lesson(name, null);
    }
}
