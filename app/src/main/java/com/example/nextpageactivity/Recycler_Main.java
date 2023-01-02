package com.example.nextpageactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Recycler_Main extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_main);
         RecyclerView recyclerView=findViewById(R.id.recyclerview);
        List<Item> items=new ArrayList<Item>();
        items.add(new Item("John Wicket", "john@gmail.com",R.drawable.a));
        items.add(new Item("Rachel", "rachel@gmail.com",R.drawable.b));
        items.add(new Item("Monica", "monica@gmail.com",R.drawable.c));
        items.add(new Item("Phoebe ", "phoebe@gmail.com",R.drawable.e));
        items.add(new Item("Chandler ", "chandler@gmail.com",R.drawable.f));
        items.add(new Item("Joey", "joey@gmail.com",R.drawable.g));
        items.add(new Item("Ross", "ross@gmail.com",R.drawable.h));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


    }

}
