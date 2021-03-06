/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import spring.kotlin.jooq.generated.jooq.tables.Users;


/**
 * Users
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record7<Integer, String, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -1422268557;

    /**
     * Setter for <code>users.id</code>. User ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>users.id</code>. User ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>users.login_id</code>. Login ID
     */
    public void setLoginId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>users.login_id</code>. Login ID
     */
    public String getLoginId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>users.password</code>. Password
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>users.password</code>. Password
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>users.nickname</code>. Nickname
     */
    public void setNickname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>users.nickname</code>. Nickname
     */
    public String getNickname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>users.note</code>. Note
     */
    public void setNote(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>users.note</code>. Note
     */
    public String getNote() {
        return (String) get(4);
    }

    /**
     * Setter for <code>users.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>users.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>users.update_time</code>.
     */
    public void setUpdateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>users.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.LOGIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Users.USERS.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Users.USERS.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return Users.USERS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return Users.USERS.UPDATE_TIME;
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
        return getLoginId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component7() {
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
    public String value2() {
        return getLoginId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value6() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setLoginId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value7(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Integer value1, String value2, String value3, String value4, String value5, LocalDateTime value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer id, String loginId, String password, String nickname, String note, LocalDateTime createTime, LocalDateTime updateTime) {
        super(Users.USERS);

        set(0, id);
        set(1, loginId);
        set(2, password);
        set(3, nickname);
        set(4, note);
        set(5, createTime);
        set(6, updateTime);
    }
}
