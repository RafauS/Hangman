package com.example.hangman;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    static final String DB_NAME = "CATEGORIES";
    static final int DB_VERSION = 1;

    //static final String[] categories = {"SPORT","FILM","ANIMAL"};

    static final String TABLE_NAME = "CATEGORIES";

    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(SPORT TEXT, FILM TEXT, ANIMAL TEXT);";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }
}
