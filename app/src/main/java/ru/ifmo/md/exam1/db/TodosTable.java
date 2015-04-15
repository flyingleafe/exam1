package ru.ifmo.md.exam1.db;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by flyingleafe on 23.01.15.
 */
public class TodosTable extends BaseTable {
    public static final String TABLE_NAME = "todos";
    public static final String COLUMN_NAME_CREATED_AT = "created_at";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_NAME_DESC = "desc";

    private static final String SQL_CREATE_TODOS =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    _ID + " INTEGER PRIMARY KEY," +
                    COLUMN_NAME_CREATED_AT + INTEGER_TYPE + COMMA_SEP +
                    COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                    COLUMN_NAME_DESC + INTEGER_TYPE + " );";

    private static final String SQL_DELETE_TODOS =
            "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    public static void create(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TODOS);
    }

    public static void delete(SQLiteDatabase db) {
        db.execSQL(SQL_DELETE_TODOS);
    }
}
