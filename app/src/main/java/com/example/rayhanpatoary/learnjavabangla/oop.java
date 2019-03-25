package com.example.rayhanpatoary.learnjavabangla;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class oop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oop);
        getSupportActionBar().setTitle("অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিং");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        set_items();
        LinearLayout item1 = findViewById(R.id.item11);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });


        LinearLayout item2 = findViewById(R.id.item12);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });


        LinearLayout item3 = findViewById(R.id.item13);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });


        LinearLayout item4 = findViewById(R.id.item14);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });

        LinearLayout item5 = findViewById(R.id.item15);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });

        LinearLayout item6 = findViewById(R.id.item16);
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });

    }
    void set_items(){
        set_item1();
        set_item2();
        set_item3();
        set_item4();
        set_item5();
        set_item6();
    }

    @SuppressLint("ResourceAsColor")
    private void set_item6() {
        LinearLayout item6 = findViewById(R.id.item16);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("১৬ তম অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.polymorphysom_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("পলিমরফিসম");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item5() {
        LinearLayout item5 = findViewById(R.id.item15);
        TextView item5text1 = (TextView)item5.findViewById(R.id.text1);
        item5text1.setText("১৫ তম অধ্যায়");
        item5text1.setBackgroundResource(R.drawable.interface_image);
        item5text1.setTextColor(R.color.colorblack);
        TextView item5text2 = (TextView)item5.findViewById(R.id.text2);
        item5text2.setText("ইন্টারফেস");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item4() {
        LinearLayout item4 = findViewById(R.id.item14);
        TextView item4text1 = (TextView)item4.findViewById(R.id.text1);
        item4text1.setText("১৪ তম অধ্যায় ");
        item4text1.setBackgroundResource(R.drawable.inharitance_image);
        item4text1.setTextColor(R.color.colorblack);
        TextView item4text2 = (TextView)item4.findViewById(R.id.text2);
        item4text2.setText("ইনহেরিটেন্স");
    }

    private void set_item3() {
        LinearLayout item3 = findViewById(R.id.item13);
        TextView item3text1 = (TextView)item3.findViewById(R.id.text1);
        item3text1.setText("১৩ তম অধ্যায়");
        item3text1.setBackgroundResource(R.drawable.encapsulation_image);;
        TextView item3text2 = (TextView)item3.findViewById(R.id.text2);
        item3text2.setText("এনক্যাপ্সুলেশন");
    }

    private void set_item2() {
        LinearLayout item2 = findViewById(R.id.item12);
        TextView item2text1 = (TextView)item2.findViewById(R.id.text1);
        item2text1.setText("১২ তম অধ্যায়");
        item2text1.setBackgroundResource(R.drawable.constructor_image);;
        TextView item2text2 = (TextView)item2.findViewById(R.id.text2);
        item2text2.setText("কন্সট্রাক্টর ");
    }

    protected void set_item1() {
        LinearLayout item1 = findViewById(R.id.item11);
        TextView item1text1 = (TextView)item1.findViewById(R.id.text1);
        item1text1.setText("১১ তম অধ্যায়");
        item1text1.setBackgroundResource(R.drawable.class_object_image);
        TextView item1text2 = (TextView)item1.findViewById(R.id.text2);
        item1text2.setText("ক্লাস & অবজেক্ট");
    }

    void start_basic_two_options_activity(){
        Intent intent = new Intent(oop.this,basic_two_options.class);
        startActivity(intent);
    }
}
