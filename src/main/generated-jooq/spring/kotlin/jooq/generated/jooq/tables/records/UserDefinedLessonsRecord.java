/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import spring.kotlin.jooq.generated.jooq.tables.UserDefinedLessons;


/**
 * User Defined Lessons
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDefinedLessonsRecord extends UpdatableRecordImpl<UserDefinedLessonsRecord> implements Record6<Integer, Integer, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 141292947;

    /**
     * Setter for <code>user_defined_lessons.id</code>. id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_defined_lessons.id</code>. id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>user_defined_lessons.user_id</code>. ユーザーid
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_defined_lessons.user_id</code>. ユーザーid
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>user_defined_lessons.title</code>. タイトル
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>user_defined_lessons.title</code>. タイトル
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>user_defined_lessons.description</code>. 説明
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>user_defined_lessons.description</code>. 説明
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>user_defined_lessons.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>user_defined_lessons.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>user_defined_lessons.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>user_defined_lessons.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserDefinedLessons.USER_DEFINED_LESSONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserDefinedLessons.USER_DEFINED_LESSONS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserDefinedLessons.USER_DEFINED_LESSONS.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserDefinedLessons.USER_DEFINED_LESSONS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return UserDefinedLessons.USER_DEFINED_LESSONS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return UserDefinedLessons.USER_DEFINED_LESSONS.UPDATE_TIME;
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
    public Integer component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component6() {
        return getUpdateTime();
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
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedLessonsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedLessonsRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedLessonsRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedLessonsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedLessonsRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedLessonsRecord value6(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDefinedLessonsRecord values(Integer value1, Integer value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserDefinedLessonsRecord
     */
    public UserDefinedLessonsRecord() {
        super(UserDefinedLessons.USER_DEFINED_LESSONS);
    }

    /**
     * Create a detached, initialised UserDefinedLessonsRecord
     */
    public UserDefinedLessonsRecord(Integer id, Integer userId, String title, String description, LocalDateTime createTime, LocalDateTime updateTime) {
        super(UserDefinedLessons.USER_DEFINED_LESSONS);

        set(0, id);
        set(1, userId);
        set(2, title);
        set(3, description);
        set(4, createTime);
        set(5, updateTime);
    }
}