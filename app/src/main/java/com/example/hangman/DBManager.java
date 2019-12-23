package com.example.hangman;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DBManager {
    private DatabaseHelper dbHelper;
    private SQLiteDatabase database;
    private Context context;


    public DBManager(Context c){
        context = c;
    }

    public DBManager open() throws SQLException{
        dbHelper = new DatabaseHelper(context);
        database = dbHelper.getReadableDatabase();
        return this;
    }

    public void close(){
        dbHelper.close();
    }


    public ArrayList getColumnDates(String columnName){
        ArrayList<String> arr = new ArrayList<String>();
        Cursor res = database.rawQuery("Select * from CATEGORIES WHERE " + columnName + " IS NOT NULL",null);
        res.moveToFirst();

        while(res.isAfterLast() == false) {
                arr.add(res.getString(res.getColumnIndex(columnName)));
                res.moveToNext();
        }
        return arr;

    }
}
