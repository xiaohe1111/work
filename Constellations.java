package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Constellations extends AppCompatActivity {
    DBManager mDbManager;

    {
        mDbManager = new DBManager(getApplicationContext());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constellations);

    }

    public void openThree(View btn){
        Log.i("open","openOne:");
        Intent config = new Intent(this,Constellations2.class);
        startActivityForResult(config,5);
    }

    public void openTwo(View btn){
        Log.i("open","openOne:");
        Intent config = new Intent(this,Constellation3.class);
        startActivityForResult(config,5);
    }



}