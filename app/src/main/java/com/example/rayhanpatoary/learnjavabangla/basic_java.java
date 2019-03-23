package com.example.rayhanpatoary.learnjavabangla;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class basic_java extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_java);
        getSupportActionBar().setTitle("ব্যাসিক জাভা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        set_deshboard();
        LinearLayout item1 = findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                start_basic_two_options_activity();
            }
        });
        LinearLayout item2 = findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item3 = findViewById(R.id.item3);
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item4 = findViewById(R.id.item4);
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });

        LinearLayout item5 = findViewById(R.id.item5);
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item6 = findViewById(R.id.item6);
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item7 = findViewById(R.id.item7);
        item7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item8 = findViewById(R.id.item8);
        item8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item9 = findViewById(R.id.item9);
        item9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });
        LinearLayout item10 = findViewById(R.id.item10);
        item10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_two_options_activity();
            }
        });





    }

    private void set_deshboard() {
        set_item1();
        set_item2();
        set_item3();
        set_item4();
        set_item5();
        set_item6();
        set_item7();
        set_item8();
       set_item9();
        set_item10();

    }

    private void set_item10() {
        LinearLayout item10 = findViewById(R.id.item10);
        TextView item10text1 = (TextView)item10.findViewById(R.id.text1);
        item10text1.setText("১০ ম অধ্যায়");
        item10text1.setBackgroundResource(R.drawable.method);
        TextView item10text2 = (TextView)item10.findViewById(R.id.text2);
        item10text2.setText("মেথড");
    }


    private void set_item9() {
        LinearLayout item9 = findViewById(R.id.item9);
        TextView item9text1 = (TextView)item9.findViewById(R.id.text1);
        item9text1.setText("৯ ম অধ্যায়");
        item9text1.setBackgroundResource(R.drawable.array_image);
        TextView item9text2 = (TextView)item9.findViewById(R.id.text2);
        item9text2.setText("এরে");
    }


    @SuppressLint("ResourceAsColor")
    private void set_item8() {
        LinearLayout item8 = findViewById(R.id.item8);
        TextView item8text1 = (TextView)item8.findViewById(R.id.text1);
        item8text1.setText("৮ ম অধ্যায় ");
        item8text1.setBackgroundResource(R.drawable.loop_image);
        item8text1.setTextColor(R.color.colorblack);
        TextView item8text2 = (TextView)item8.findViewById(R.id.text2);
        item8text2.setText("হোয়াইল লুপ ");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item7() {
        LinearLayout item7 = findViewById(R.id.item7);
        TextView item7text1 = (TextView)item7.findViewById(R.id.text1);
        item7text1.setText("৭ম অধ্যায়");
        item7text1.setBackgroundResource(R.drawable.loop_image);
        item7text1.setTextColor(R.color.colorblack);
        TextView item7text2 = (TextView)item7.findViewById(R.id.text2);
        item7text2.setText("ফর লুপ ");
    }


    @SuppressLint("ResourceAsColor")
    private void set_item6() {
        LinearLayout item6 = findViewById(R.id.item6);
        TextView item6text1 = (TextView)item6.findViewById(R.id.text1);
        item6text1.setText("৬ষ্ঠ অধ্যায়");
        item6text1.setBackgroundResource(R.drawable.loop_image);
        item6text1.setTextColor(R.color.colorblack);
        TextView item6text2 = (TextView)item6.findViewById(R.id.text2);
        item6text2.setText("লুপ কি ? ");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item5() {
        LinearLayout item5 = findViewById(R.id.item5);
        TextView item5text1 = (TextView)item5.findViewById(R.id.text1);
        item5text1.setText("৫ম অধ্যায়");
        item5text1.setBackgroundResource(R.drawable.codition_image);
        item5text1.setTextColor(R.color.colorblack);
        TextView item5text2 = (TextView)item5.findViewById(R.id.text2);
        item5text2.setText("একাধিক কন্ডিশন ");
    }

    @SuppressLint("ResourceAsColor")
    private void set_item4() {
        LinearLayout item4 = findViewById(R.id.item4);
        TextView item4text1 = (TextView)item4.findViewById(R.id.text1);
        item4text1.setText("৪র্থ অধ্যায়");
        item4text1.setBackgroundResource(R.drawable.codition_image);
        item4text1.setTextColor(R.color.colorblack);
        TextView item4text2 = (TextView)item4.findViewById(R.id.text2);
        item4text2.setText("কন্ডিশন বা শর্ত ");
    }

    private void set_item3() {
        LinearLayout item3 = findViewById(R.id.item3);
        TextView item3text1 = (TextView)item3.findViewById(R.id.text1);
        item3text1.setText("৩য় অধ্যায়");
        item3text1.setBackgroundResource(R.drawable.operators);;
        TextView item3text2 = (TextView)item3.findViewById(R.id.text2);
        item3text2.setText("অপারেটরস & ইউসার ইনপুট");
    }

    private void set_item2() {
        LinearLayout item2 = findViewById(R.id.item2);
        TextView item2text1 = (TextView)item2.findViewById(R.id.text1);
        item2text1.setText("২য় অধ্যায়");
        item2text1.setBackgroundResource(R.drawable.variable_image);;
        TextView item2text2 = (TextView)item2.findViewById(R.id.text2);
        item2text2.setText("ডাটা টাইপ এবং ভ্যারিয়েবল ");
    }

    protected void set_item1() {
        LinearLayout item1 = findViewById(R.id.item1);
        TextView item1text1 = (TextView)item1.findViewById(R.id.text1);
        item1text1.setText("১ম  অধ্যায় ");
        item1text1.setBackgroundResource(R.drawable.introduction_image);
        TextView item1text2 = (TextView)item1.findViewById(R.id.text2);
        item1text2.setText("জাভা প্রোগ্রামিং পরিচিতি");
    }


    void start_basic_two_options_activity(){
        Intent intent = new Intent(basic_java.this,basic_two_options.class);
        startActivity(intent);
    }
}
