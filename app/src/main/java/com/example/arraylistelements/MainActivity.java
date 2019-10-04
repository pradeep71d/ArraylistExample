package com.example.arraylistelements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String>arrayList=new ArrayList<>();
        System.out.println("is arraylist empty="+arrayList.isEmpty());
        arrayList.add("amazon");
        arrayList.add("google");
        arrayList.add("apple");
        arrayList.add("ashmar");
        arrayList.add("monet");
        arrayList.add("ducat");
        System.out.println("elements are in arraylist="+arrayList);
        System.out.println("arraylist size is="+arrayList.size());
        System.out.println("elements at position is="+arrayList.get(1));
        for (int i=0;i<arrayList.size();i++){
            System.out.println("elements are="+arrayList.get(i));
        }
    }
}
