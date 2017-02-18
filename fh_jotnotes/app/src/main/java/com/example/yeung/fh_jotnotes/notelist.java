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
        ListView lv=(ListView)findViewById(R.id.notelist1);
        ArrayList<Note> notes=(ArrayList<Note>)getIntent().getSerializableExtra("notes");
        ArrayList<String> x=new ArrayList<String>();
        for(Note y:notes)
        {
            x.add(y.getNote()+" "+y.getDate()+" "+y.getTags());
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,x);
        lv.setAdapter(arrayAdapter);
    }

}
