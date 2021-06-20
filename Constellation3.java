package com.example.myapplication;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class Constellation3 extends AppCompatActivity {
    private EditText fText;
    private Button btn;
    private DBManager dbm;
    private Cursor cursor;
    private ListView listView;
    private SimpleCursorAdapter adapter;
    private LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constellation3);
        fText = (EditText) findViewById(R.id.花语3);
        btn = (Button) findViewById(R.id.查询);
        listView = (ListView) findViewById(R.id.searchlistView);
        layout = (LinearLayout) findViewById(R.id.结果);
    }

    public void onClick(View v){
            btn.setVisibility(View.GONE);
            fText.setVisibility(View.GONE);
            layout.setVisibility(View.VISIBLE);
            String name = fText.getText().toString();
            cursor = dbm.findFlower(name);
            //如果有所查询的信息，则将查询结果显示出来
            adapter = new SimpleCursorAdapter(this, R.layout.activity_flower_list,
                        cursor, new String[] {}, new int[] {});
            listView.setAdapter(adapter);

    }

}
