package com.example.nuttygeek.rudrakshapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nuttygeek on 14/8/17.
 */

public class VariousRudrakshHolder extends RecyclerView.ViewHolder {

    CardView cardView;
    TextView textView;


    public VariousRudrakshHolder(View v) {
        super(v);

        cardView  = (CardView)v.findViewById(R.id.card_view);
        textView   = (TextView)v.findViewById(R.id.menu_text);
    }
}
