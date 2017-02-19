package com.example.yeung.fh_jotnotes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class notelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notelist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }/*
    public static void update() {
        ListView lv = (ListView) findViewById(R.id.notelist1);//something here doesn't work
        ArrayList<String> notes = new ArrayList<String>();
        Bundle extras = getIntent().getExtras();
        String x = "";
        if (extras != null) {
            x = extras.getString("note");
        }
        if (x != "") {
            notes.add(x);
        }
        lv = (ListView) findViewById(R.id.notelist1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, notes);
        lv.setAdapter(arrayAdapter);

    }
*/

}
