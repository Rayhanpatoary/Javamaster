package com.example.rayhanpatoary.learnjavabangla;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


public class home extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    public void onActivityCreated(Bundle savedInstanceState1) {
        set_dashboard();
        LinearLayout item1 = getActivity().findViewById(R.id.item1);
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start_basic_java_activity();
            }
        });

        super.onActivityCreated(savedInstanceState1);
    }

    private void set_dashboard() {
        set_item1();
        set_item2();
        set_item3();
        set_item4();
        set_item5();

    }

    private void set_item1() {

        LinearLayout item1 = getActivity().findViewById(R.id.item1);
        TextView item1text1 = (TextView)item1.findViewById(R.id.text1);
        item1text1.setText("ব্যাসিক জাভা প্রোগ্রামিং");
        item1text1.setBackgroundResource(R.drawable.basic_image);
        TextView item1text2 = (TextView)item1.findViewById(R.id.text2);
        item1text2.setText("Variable , if else ,Loop , array etc");

    }


    private void set_item2() {

        LinearLayout item2 = getActivity().findViewById(R.id.item2);
        TextView item2text1 = (TextView)item2.findViewById(R.id.text1);
        item2text1.setText("অবজেক্ট ওরিয়েন্টেড প্রোগ্রামিং ");
        item2text1.setBackgroundResource(R.drawable.oop_image);;
        TextView item2text2 = (TextView)item2.findViewById(R.id.text2);
        item2text2.setText("Inheritance , Interface , Polymorphysom ,Encapsolation");
    }
    private void set_item3() {
        LinearLayout item3 = getActivity().findViewById(R.id.item3);
        TextView item3text1 = (TextView)item3.findViewById(R.id.text1);
        item3text1.setText("এডভান্স জাভা");
        item3text1.setBackgroundResource(R.drawable.advance_java);;
        TextView item3text2 = (TextView)item3.findViewById(R.id.text2);
        item3text2.setText("Exeption Hadling, import i/o");
    }
    @SuppressLint("ResourceAsColor")
    private void set_item4() {
        LinearLayout item4 = getActivity().findViewById(R.id.item4);
        TextView item4text1 = (TextView)item4.findViewById(R.id.text1);
        item4text1.setText("জাভার বিভিন্ন ফ্রেমওয়ার্ক পরিচিতি");
        item4text1.setBackgroundResource(R.drawable.java_frameworks);

        TextView item4text2 = (TextView)item4.findViewById(R.id.text2);
        item4text2.setText("Spring Boot , Spring MVC,GWT, JSF, Play framework etc");
    }
    private void set_item5() {
        LinearLayout item5 = getActivity().findViewById(R.id.item5);
        TextView item5text1 = (TextView)item5.findViewById(R.id.text1);
        item5text1.setText("জাভা সার্টিফিকেশন এক্সাম");
        item5text1.setBackgroundResource(R.drawable.certification);

        TextView item5text2 = (TextView)item5.findViewById(R.id.text2);
        item5text2.setText("Oracle (APEX)");
    }


    void start_basic_java_activity(){
        Intent intent = new Intent(getContext(),basic_java.class);
        startActivity(intent);
    }







}
