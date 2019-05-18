/*
 * This file is generated by jOOQ.
 */
package spring.kotlin.jooq.generated.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import spring.kotlin.jooq.generated.jooq.tables.Contents;
import spring.kotlin.jooq.generated.jooq.tables.Lesson;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 431900397;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * ミュージック
     */
    public final Contents CONTENTS = spring.kotlin.jooq.generated.jooq.tables.Contents.CONTENTS;

    /**
     * アーティスト
     */
    public final Lesson LESSON = spring.kotlin.jooq.generated.jooq.tables.Lesson.LESSON;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Contents.CONTENTS,
            Lesson.LESSON);
    }
}
