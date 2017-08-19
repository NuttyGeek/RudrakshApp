package com.example.nuttygeek.rudrakshapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nuttygeek on 11/8/17.
 */

public class ScientificIntroduction extends android.support.v4.app.Fragment {

    CardView cardOne;
    TextView one;
    public ScientificIntroduction() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.scientific_introduction,container,false);

        one = (TextView)v.findViewById(R.id.chemical_text);
        one.setVisibility(View.GONE);

        cardOne = (CardView)v.findViewById(R.id.card_one);
        cardOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setVisibility(View.VISIBLE);
            }
        });
        return v;


    }
}
