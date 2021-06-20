package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DB_NAME = "myflowers.db";
    public static final String TB_NAME = "tb_flowers";
    public DBHelper(Context context, String name) {
        super(context, name,null,VERSION);
        Log.i("txttodb", "DBHelper--oncreate");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("txttodb", "sql--oncreate");
        db.execSQL("CREATE TABLE "+TB_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,CURNAME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}
