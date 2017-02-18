package com.example.yeung.fh_jotnotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class newnote extends AppCompatActivity {


    ArrayList<Note> notes=new ArrayList<Note>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newnote);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button submit=(Button)findViewById(R.id.button3);
        Button cancel=(Button)findViewById(R.id.button2);
        cancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(newnote.this,MainActivity.class));
            }
        }
        );
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText notetext=(EditText)findViewById(R.id.edit_message);
                ArrayList<String> tags=new ArrayList<String>();
                Note newnote=new Note((notetext.getText().toString()),tags);
                notes.add(newnote);
                startActivity(new Intent(newnote.this, MainActivity.class));
                Intent intent=new Intent(newnote.this,notelist.class);
                intent.putExtra("notes",notes);
            }
        });

    }

}
