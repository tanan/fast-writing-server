/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import spring.kotlin.jooq.generated.jooq.tables.Lesson;


/**
 * アーティスト
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LessonRecord extends UpdatableRecordImpl<LessonRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -258700960;

    /**
     * Setter for <code>lesson.id</code>. id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lesson.id</code>. id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lesson.title</code>. 名前
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lesson.title</code>. 名前
     */
    public String getTitle() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Lesson.LESSON.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Lesson.LESSON.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LessonRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LessonRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LessonRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LessonRecord
     */
    public LessonRecord() {
        super(Lesson.LESSON);
    }

    /**
     * Create a detached, initialised LessonRecord
     */
    public LessonRecord(Integer id, String title) {
        super(Lesson.LESSON);

        set(0, id);
        set(1, title);
    }
}
