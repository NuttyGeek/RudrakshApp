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


    TextView one,two,three;
    CardView cardOne,cardTwo,cardThree;
    public ScientificIntroduction() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.scientific_introduction,container,false);

        one = (TextView)v.findViewById(R.id.chemical_text);
        two = (TextView)v.findViewById(R.id.text_electrical);
        three = (TextView)v.findViewById(R.id.text_magnetic);

        cardOne = (CardView)v.findViewById(R.id.card_one);
        cardTwo = (CardView)v.findViewById(R.id.card_two);
        cardThree = (CardView)v.findViewById(R.id.card_three);

        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);
        three.setVisibility(View.GONE);


        cardOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              one.setVisibility(View.VISIBLE);
                two.setVisibility(View.GONE);
                three.setVisibility(View.GONE);
            }
        });

        cardTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two.setVisibility(View.VISIBLE);
                one.setVisibility(View.GONE);
                three.setVisibility(View.GONE);

            }
        });

        cardThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                three.setVisibility(View.VISIBLE);
                one.setVisibility(View.GONE);
                two.setVisibility(View.GONE);
            }
        });

        return v;
    }


}
