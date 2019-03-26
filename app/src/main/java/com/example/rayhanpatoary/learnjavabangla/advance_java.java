package com.example.rayhanpatoary.learnjavabangla;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class advance_java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_java);
        getSupportActionBar().setTitle("এডভ্যান্স জাভা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        set_items();

        LinearLayout item1 = findViewById(R.id.item17);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });
        LinearLayout item2 = findViewById(R.id.item18);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item3 = findViewById(R.id.item19);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item4 = findViewById(R.id.item20);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });

        LinearLayout item5 = findViewById(R.id.item21);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item6 = findViewById(R.id.item22);
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item7 = findViewById(R.id.item23);
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item8 = findViewById(R.id.item24);

    }

    void set_items(){
        set_item1();
        set_item2();
        set_item3();
        set_item4();
        set_item4();
        set_item5();
        set_item6();
        set_item7();
        set_item8();
    }

    @SuppressLint("ResourceAsColor")
    private void set_item1() {
        LinearLayout item6 = findViewById(R.id.item17);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("১৭ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.finilize_method_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("ফাইনালাইজ মেথড");
    }
    @SuppressLint("ResourceAsColor")
    private void set_item2() {
        LinearLayout item6 = findViewById(R.id.item18);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("১৮ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.vector_java_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("ভেক্টর");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item3() {
        LinearLayout item6 = findViewById(R.id.item19);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("১৯ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.package_java_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("প্যাকেজ");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item4() {
        LinearLayout item6 = findViewById(R.id.item20);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("২০ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.thread_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("থ্রেড");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item5() {
        LinearLayout item6 = findViewById(R.id.item21);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("২১ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.multithreading_java_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("মাল্টিথ্রেড");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item6() {
        LinearLayout item6 = findViewById(R.id.item22);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("২২ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.exeption_handling_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("এক্সেপশন হ্যান্ডেলিং");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item7() {
        LinearLayout item6 = findViewById(R.id.item23);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("২৩ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.file_io_image1);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("ফাইল i/o");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item8() {
        LinearLayout item6 = findViewById(R.id.item24);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("২৪ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.network_java_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("নেটওয়ার্কিং প্রোগ্রামিং");
    }

    void start_basic_two_options_activity(){
        Intent intent = new Intent(advance_java.this,basic_two_options.class);
        startActivity(intent);
    }





}
