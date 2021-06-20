package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Constellations2 extends AppCompatActivity {

    TextView af;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constellations2);
        doRaw();
    }

    //读取已经爬取到的txt文件
    private void doRaw(){
        InputStream is = this.getResources().openRawResource(R.raw.flowers);
        try{
            doRead(is);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private void doRead(InputStream is) throws IOException{
        DataInputStream dis = new DataInputStream(is);
        byte[]buffer = new byte[is.available()];
        dis.readFully(buffer);
        af.setText(new String(buffer));
        dis.close();
        is.close();
    }





}