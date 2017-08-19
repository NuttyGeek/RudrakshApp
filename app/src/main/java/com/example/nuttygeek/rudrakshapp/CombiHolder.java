package com.example.nuttygeek.rudrakshapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by nuttygeek on 18/8/17.
 */

public class CombiHolder extends RecyclerView.ViewHolder {

     TextView imageLabelOne,imageLabelTwo,imageLabelThree,heading;
     ImageView imageViewOne,imageViewTwo,imageViewThree;
     TextView quantityOne,quantityTwo,quantityThree;
     CardView cardView;
     LinearLayout lOne,lTwo,lThree,view;


    public CombiHolder(View v) {
        super(v);

        heading = (TextView)v.findViewById(R.id.heading);

        view = (LinearLayout)v.findViewById(R.id.view);
        // view 1
        imageLabelOne = (TextView) v.findViewById(R.id.image_label1);
        imageViewOne  = (ImageView) v.findViewById(R.id.image1);
        quantityOne = (TextView) v.findViewById(R.id.quantity1);

        cardView = (CardView) v.findViewById(R.id.card);

        // view 2
        imageLabelTwo = (TextView) v.findViewById(R.id.image_label2);
        imageViewTwo  = (ImageView) v.findViewById(R.id.image2);
        quantityTwo = (TextView) v.findViewById(R.id.quantity2);

        // view 3
        imageLabelThree = (TextView) v.findViewById(R.id.image_label3);
        imageViewThree  = (ImageView) v.findViewById(R.id.image3);
        quantityThree = (TextView) v.findViewById(R.id.quantity3);

        // layout views
        lOne = (LinearLayout)v.findViewById(R.id.view1);
        lTwo = (LinearLayout)v.findViewById(R.id.view2);
        lThree = (LinearLayout)v.findViewById(R.id.view3);

    }


}
