package com.example.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DBManager {

    private DBHelper mDbHelper;
    private SQLiteDatabase mDb;

    public DBManager(Context context) {
        Log.i("txttodb", "DBManager--oncreate");
        mDbHelper = new DBHelper(context, "myflowers.db");
        //执行getWritableDatabase或者getReadableDatabase才能生成.db文件
        mDb = mDbHelper.getWritableDatabase();
    }


    public Cursor findFlower(String name) {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();
        Cursor cursor = db.query("tb_flowers", null, "CURNAME like ?", new String[]{"%name%"}, null, null, "ID INTEGER desc", null);
        return  cursor;
    }


}
