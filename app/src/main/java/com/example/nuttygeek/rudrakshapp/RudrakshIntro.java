package com.example.nuttygeek.rudrakshapp;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SectionIndexer;
import android.widget.Toast;

public class RudrakshIntro extends AppCompatActivity {
    ViewPager viewPager;
    SectionPagerAdapter sectionPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rudraksh_intro);

        sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager)findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionPagerAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case android.R.id.home: finish();
                break;
            
        }
        return super.onOptionsItemSelected(item);
    }

    public class SectionPagerAdapter extends FragmentPagerAdapter
    {

        public SectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment= null;
            switch(position)
            {
                case 0: fragment= new MythologicalIntroduction();
                    break;
                case 1: fragment = new ScientificIntroduction();
            }

            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.myth);
                case 1:
                    return getString(R.string.sci);
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
