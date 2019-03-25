package com.example.rampart;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "register.db";
    public static final String TABLE_NAME = "register";
    public static final String COL_ONE = "ID";
    public static final String COL_TWO = "FirstName";
    public static final String COL_THREE = "LastName";
    public static final String COL_FOUR = "Password";
    public static final String COL_FIVE = "Email";
    public static final String COL_SIX = "Phone";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE register" + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, FirstName Text, LastName TEXT, Password TEXT, Email TEXT, Phone TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS register"); // Drop older table if it exists.
        onCreate(db);

    }
}
