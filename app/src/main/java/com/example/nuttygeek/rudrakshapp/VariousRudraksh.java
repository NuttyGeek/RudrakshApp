package com.example.nuttygeek.rudrakshapp;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class VariousRudraksh extends AppCompatActivity {

    TextView planetName,godName,mantraEnglish,mantraHindi,description;
    ImageView planetImage,godImage,playButton;
    RecyclerView rview;
    RudrakshPOJO rudraObj;
    Toolbar toolbar;
    RudraDatabase db;
    CardView cardOne;
    String[] mukhi = {"1 Mukhi","2 Mukhi","3 Mukhi","4 Mukhi","5 Mukhi","6 Mukhi","7 Mukhi","8 Mukhi","9 Mukhi","10 Mukhi","11 Mukhi","12 Mukhi","13 Mukhi","14 Mukhi","Gauri Shankar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_various_rudraksh);

        planetName = (TextView)findViewById(R.id.planet_name);
        godName = (TextView)findViewById(R.id.god_name);
        mantraEnglish = (TextView)findViewById(R.id.mantra_eng);
        mantraHindi = (TextView)findViewById(R.id.mantra_hindi);
        description = (TextView)findViewById(R.id.description);
        planetImage = (ImageView)findViewById(R.id.planet_image);
        godImage = (ImageView)findViewById(R.id.god_image);
        playButton = (ImageView)findViewById(R.id.play);

        cardOne = (CardView)findViewById(R.id.card_one);



        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        db = new RudraDatabase(this,"rudraDB");
        rudraObj = db.getData(1);
        planetName.setText(rudraObj.getPlanet());
        godName.setText(rudraObj.getGod());
        mantraEnglish.setText(rudraObj.getMantra());
        mantraHindi.setText(rudraObj.getMantraHindi());
        planetImage.setImageResource(R.drawable.sun);
        description.setText(R.string.description_one);


        rview = (RecyclerView)findViewById(R.id.rview);
        LinearLayoutManager lManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rview.setLayoutManager(lManager);
        rview.setAdapter(new VRAdapter(this));
        rview.addOnItemTouchListener(new RecycleViewClickListener(this, new RecycleViewClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                rudraObj  = db.getData(position+1);
                planetName.setText(rudraObj.getPlanet());
                godName.setText(rudraObj.getGod());
                mantraEnglish.setText(rudraObj.getMantra());
                mantraHindi.setText(rudraObj.getMantraHindi());

                switch(rudraObj.getPlanet())
                {
                    case "Sun": planetImage.setImageResource(R.drawable.sun);
                                cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Moon": planetImage.setImageResource(R.drawable.moon);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Mercury": planetImage.setImageResource(R.drawable.mercury);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Venus": planetImage.setImageResource(R.drawable.venus);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Mars": planetImage.setImageResource(R.drawable.mars);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Jupiter": planetImage.setImageResource(R.drawable.jupiter);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Saturn": planetImage.setImageResource(R.drawable.saturn);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Rahu": planetImage.setImageResource(R.drawable.rahu);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    case "Ketu": planetImage.setImageResource(R.drawable.ketu);
                        cardOne.setVisibility(View.VISIBLE);
                        break;
                    default: cardOne.setVisibility(View.INVISIBLE);

                }
                switch(position)
                {
                    case 1: description.setText(R.string.description_one);
                        break;
                    case 2: description.setText(R.string.description_two);
                        break;
                    case 3: description.setText(R.string.description_three);
                    break;
                    case 4: description.setText(R.string.description_four);
                        break;
                    case 5: description.setText(R.string.description_five);
                        break;
                    case 6: description.setText(R.string.description_six);
                        break;
                    case 7: description.setText(R.string.description_seven);
                        break;
                    case 8: description.setText(R.string.description_eight);
                        break;
                    case 9: description.setText(R.string.description_nine);
                        break;
                    case 10: description.setText(R.string.description_ten);
                        break;
                    case 11: description.setText(R.string.description_eleven);
                        break;
                    case 12: description.setText(R.string.description_twelve);
                        break;
                    case 13: description.setText(R.string.description_thirteen);
                        break;
                    case 14: description.setText(R.string.description_fourteen);
                        break;
                    case 15: description.setText(R.string.description_fifteen);
                        break;

                }

//                switch(rudraObj.getGod())
//                {
//                    case "Shiva & Parvati": godImage.setImageResource(R.drawable.shivparvati);
//                        break;
//                }


            }
        }));

    }



    public void play(View v)
    {
        Toast.makeText(this, "Playing Sound ...", Toast.LENGTH_SHORT).show();

    }

    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home : finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
