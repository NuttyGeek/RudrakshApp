package com.example.nuttygeek.rudrakshapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class RudrakshTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rudraksh_tips);

        Toolbar toolbar  = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        TextView tipsHeading = (TextView)findViewById(R.id.tips_heading);
        TextView tipsText = (TextView)findViewById(R.id.tips_text);
        tipsHeading.setText(R.string.tips_heading);
        tipsText.setText(R.string.tips_text);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home: finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
