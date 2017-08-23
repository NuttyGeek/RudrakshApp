package com.example.nuttygeek.rudrakshapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView menuOne,menuTwo,menuThree,menuFour,menuFive,menuSix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        menuOne = (TextView)findViewById(R.id.menu_text_one);
        menuTwo = (TextView)findViewById(R.id.menu_text_two);
        menuThree = (TextView)findViewById(R.id.menu_text_three);
        menuFour = (TextView)findViewById(R.id.menu_text_four);
        menuFive = (TextView)findViewById(R.id.menu_text_five);
        menuSix = (TextView)findViewById(R.id.menu_text_six);

        menuOne.setText(getResources().getString(R.string.menu_one));
        menuTwo.setText(getResources().getString(R.string.menu_two));
        menuThree.setText(getResources().getString(R.string.menu_three));
        menuFour.setText(getResources().getString(R.string.menu_four));
        menuFive.setText(getResources().getString(R.string.menu_five));
        menuSix.setText(getResources().getString(R.string.menu_six));



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id)
        {
            case R.id.english: setLocale("en");
                break;
            case R.id.hindi: setLocale("hi");
                break;
        }
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.english) {
//            setLocale("en");
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            startActivity(new Intent(this,RudrakshIntro.class));

        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(this,YourRudraksh.class));

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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

    // navigating with cardviews
    public void rudrakshIntro(View v){startActivity(new Intent(this,RudrakshIntro.class));}
    public void yourRudraksh(View v){startActivity(new Intent(this,YourRudraksh.class));}
    public void variousMukhis(View v){startActivity(new Intent(this,VariousRudraksh.class));}
    public void tips(View v){startActivity(new Intent(this,RudrakshTips.class));}
    public void combinations (View v) {startActivity(new Intent(this,Combinations.class));}
    public void buy(View v) {Toast.makeText(this, "Function to be added later", Toast.LENGTH_SHORT).show();}

}
