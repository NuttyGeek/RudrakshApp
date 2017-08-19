package com.example.nuttygeek.rudrakshapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class YourRudraksh extends AppCompatActivity {

    String[] zodiacSign ={"<your zodiac sign>","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Aquarius","Pisces"};

    Spinner spinner;
    Toolbar toolbar;
    CardView cardOne,cardTwo;
    ImageView imageOne,imageTwo,planetImage;
    TextView textOne,textTwo,planetName;
    CardView planetCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_rudraksh);

        planetName = (TextView)findViewById(R.id.planet_text);
        planetCard = (CardView)findViewById(R.id.planet_card);
        cardOne = (CardView)findViewById(R.id.card_one);
        cardTwo = (CardView)findViewById(R.id.card_two);
        imageOne = (ImageView)findViewById(R.id.image1);
        imageTwo = (ImageView)findViewById(R.id.image2);
        textOne = (TextView)findViewById(R.id.text_one);
        textTwo = (TextView)findViewById(R.id.text_two);
        planetImage = (ImageView)findViewById(R.id.planet_image);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        spinner = (Spinner)findViewById(R.id.spinner);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,zodiacSign));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {

                    case 1 : // mars aries 3
                        planetImage.setImageResource(R.drawable.mars);
                        planetName.setText(R.string.mars);
                        cardOne.setVisibility(View.INVISIBLE);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        textTwo.setText(R.string.three_mukhi);
                        imageTwo.setImageResource(R.drawable.three);

                        break;
                    case 2 : // venus taurus 6/13
                        planetImage.setImageResource(R.drawable.venus);
                        cardOne.setVisibility(View.VISIBLE);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        cardOne.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.mars);
                        textOne.setText(R.string.six_mukhi);
                        textTwo.setText(R.string.thirteen_mukhi);
                         imageTwo.setImageResource(R.drawable.thirteen);
                        imageOne.setImageResource(R.drawable.six);


                        break;
                    case 3 : // mercury gemini 4
                        planetImage.setImageResource(R.drawable.mercury);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.mercury);
                        cardOne.setVisibility(View.INVISIBLE);
                        textTwo.setText(R.string.four_mukhi);
                        // imageTwo.setImageResource();

                        break;
                    case 4 : // moon cancer 2
                        planetImage.setImageResource(R.drawable.moon);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.moon);
                        cardOne.setVisibility(View.INVISIBLE);
                        textTwo.setText(R.string.two_mukhi);
                        // imageTwo.setImageResource();
                        break;
                    case 5 : // sun leo 1/12
                        planetImage.setImageResource(R.drawable.sun);
                        cardOne.setVisibility(View.VISIBLE);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        cardOne.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.sun);
                        textOne.setText(R.string.one_mukhi);
                        textTwo.setText(R.string.twelve_mukhi);
                        imageTwo.setImageResource(R.drawable.twelve);
                        imageOne.setImageResource(R.drawable.one);
                        break;
                    case 6 : // mercury virgo 4
                        planetImage.setImageResource(R.drawable.mercury);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.mercury);
                        cardOne.setVisibility(View.INVISIBLE);
                        textTwo.setText(R.string.four_mukhi);
                        // imageTwo.setImageResource();
                        break;
                    case 7 : // venus libra 6/13
                        planetImage.setImageResource(R.drawable.venus);
                        cardOne.setVisibility(View.VISIBLE);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        cardOne.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.venus);
                        textOne.setText(R.string.six_mukhi);
                        textTwo.setText(R.string.thirteen_mukhi);
                         imageTwo.setImageResource(R.drawable.thirteen);
                        imageOne.setImageResource(R.drawable.six);
                        break;
                    case 8 : // mars scorpio 3
                        planetImage.setImageResource(R.drawable.mars);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.mars);
                        cardOne.setVisibility(View.INVISIBLE);
                        textTwo.setText(R.string.three_mukhi);
                        // imageTwo.setImageResource();

                        break;
                    case 9 : // jupiter sagittarius 5
                        planetImage.setImageResource(R.drawable.jupiter);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.jupiter);
                        cardOne.setVisibility(View.INVISIBLE);
                        textTwo.setText(R.string.five_mukhi);
                        // imageTwo.setImageResource();
                        break;
                    case 10 : // saturn capricorn 7/14
                        planetImage.setImageResource(R.drawable.saturn);
                        cardOne.setVisibility(View.VISIBLE);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        cardOne.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.saturn);
                        textOne.setText(R.string.seven_mukhi);
                        textTwo.setText(R.string.fourteen_mukhi);
                        imageTwo.setImageResource(R.drawable.fourteen);
                        imageOne.setImageResource(R.drawable.seven);
                        break;
                    case 11 : // saturn aquarius 7/14
                        planetImage.setImageResource(R.drawable.saturn);
                        cardOne.setVisibility(View.VISIBLE);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        cardOne.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.saturn);
                        textOne.setText(R.string.seven_mukhi);
                        textTwo.setText(R.string.fourteen_mukhi);
                        imageTwo.setImageResource(R.drawable.fourteen);
                        imageOne.setImageResource(R.drawable.seven);
                        break;
                    case 12 : // jupiter pisces 5
                        planetImage.setImageResource(R.drawable.jupiter);
                        cardTwo.setVisibility(View.VISIBLE);
                        planetCard.setVisibility(View.VISIBLE);
                        planetName.setText(R.string.jupiter);
                        cardOne.setVisibility(View.INVISIBLE);
                        textTwo.setText(R.string.five_mukhi);
                        // imageTwo.setImageResource();

                        break;
                    default: cardOne.setVisibility(View.INVISIBLE);
                        cardTwo.setVisibility(View.INVISIBLE);
                        planetCard.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, YourRudraksh.class);
        startActivity(refresh);
        finish();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case android.R.id.home: finish();
                break;
            case R.id.english: setLocale("en");
                break;
            case R.id.hindi: setLocale("hi");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void play(View v)
    {
        // play the mantra
    }
}
