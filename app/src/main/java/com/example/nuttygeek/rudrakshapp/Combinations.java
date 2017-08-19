package com.example.nuttygeek.rudrakshapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Combinations extends AppCompatActivity {
    ArrayList<CombiPOJO> list;
    android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combinations);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        list = new ArrayList<CombiPOJO>();

        list.add(new CombiPOJO("carrier",new String[]{"4mukhi","5mukhi","7mukhi"},new int[]{2,2,1}));
        list.add(new CombiPOJO("study",new String[]{"4mukhi","5mukhi","ganesh"},new int[]{1,1,1}));
        list.add(new CombiPOJO("delay",new String[]{"6mukhi","2mukhi","5mukhi"},new int[]{1,1,1}));
        list.add(new CombiPOJO("marriage",new String[]{"2mukhi","gaurishankar","null"},new int[]{2,1,0}));
        list.add(new CombiPOJO("business",new String[]{"7mukhi","ganesh","null"},new int[]{4,1,0}));
        list.add(new CombiPOJO("child",new String[]{"8mukhi","ganesh","null"},new int[]{2,1,0}));
        list.add(new CombiPOJO("raksha",new String[]{"1mukhi","3mukhi","9mukhi"},new int[]{1,2,1}));
        list.add(new CombiPOJO("kawach",new String[]{"3mukhi","5mukhi","null"},new int[]{2,2,0}));

        RecyclerView rView = (RecyclerView)findViewById(R.id.rview);
        LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rView.setLayoutManager(lm);
        rView.setAdapter(new CombiAdapter(this,list));



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home: finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
