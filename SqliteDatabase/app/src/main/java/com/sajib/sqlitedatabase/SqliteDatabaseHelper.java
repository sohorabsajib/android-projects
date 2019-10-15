package com.sajib.sqlitedatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteDatabaseHelper extends SQLiteOpenHelper {
    private static String DATABASE_NAME = "User.db";
    private static String TABLE_NAME = "User";
    private static String COL_ID = "Id";
    private static String COL_NAME = "Name";
    private static String COL_AGE = "Age";

    private static int VERSION = 1;
    private String createTable = "create table "+TABLE_NAME+"(Id Integer primary key autoincrement, Name text,age text)";

    public SqliteDatabaseHelper(@Nullable Context context ) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public long insertValues(String name, String age){
        ContentValues values = new ContentValues();
        values.put(COL_NAME,name);
        values.put(COL_AGE,age);
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        long id =sqLiteDatabase.insert(TABLE_NAME,null,values);
        sqLiteDatabase.close();
        return id;
    }

}
