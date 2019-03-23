package com.example.rayhanpatoary.learnjavabangla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.rayhanpatoary.learnjavabangla.basic_java;



public class basic_two_options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        basic_java bj = new basic_java();
        getSupportActionBar().setTitle("ব্যাসিক জাভা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_basic_two_options);
        LinearLayout item = findViewById(R.id.item);

        Button button1 = (Button)item.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_tutorial_and_code();
            }
        });
    }
    void start_tutorial_and_code(){
        Intent intent = new Intent(basic_two_options.this,tutorial_and_code.class);
        startActivity(intent);
    }
}
