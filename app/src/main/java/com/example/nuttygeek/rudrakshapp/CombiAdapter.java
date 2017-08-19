package com.example.nuttygeek.rudrakshapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nuttygeek on 19/8/17.
 */

public class CombiAdapter extends RecyclerView.Adapter<CombiHolder> {
    ArrayList<CombiPOJO> list;
    Context context;

    public CombiAdapter(Context context, ArrayList<CombiPOJO> list) {
        super();
        Log.d("ankur", "in CombiAdapter constructor");
        this.list = list;
        this.context = context;
    }

    @Override
    public CombiHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.combi_single_view, parent, false);
        Log.d("ankur", "in oncreateviewholder");
        return new CombiHolder(v);
    }

    @Override
    public void onBindViewHolder(final CombiHolder holder, int position) {

        holder.view.setVisibility(View.GONE);

        Log.d("ankur", "inonbindviewholder");
        Log.d("ankur", list.get(position).getMukhiName(1));

        switch(list.get(position).getName())
        {
            case "carrier": holder.heading.setText(R.string.carrier);
                break;
            case "study": holder.heading.setText(R.string.study);
                break;
            case "delay": holder.heading.setText(R.string.delay);
                break;
            case "marriage": holder.heading.setText(R.string.marriage);
                break;
            case "business": holder.heading.setText(R.string.business);
                break;
            case "child": holder.heading.setText(R.string.child);
                break;
            case "raksha": holder.heading.setText(R.string.raksha);
                break;
            case "kawach": holder.heading.setText(R.string.kawach);
                break;


        }

        switch (list.get(position).getMukhiName(0))
        {
            case "1mukhi": holder.imageLabelOne.setText(R.string.one_mukhi);
                            holder.imageViewOne.setImageResource(R.drawable.one);
                break;
            case "2mukhi": holder.imageLabelOne.setText(R.string.two_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.two);
                break;
            case "3mukhi": holder.imageLabelOne.setText(R.string.three_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.three);
                break;
            case "4mukhi": holder.imageLabelOne.setText(R.string.four_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.four);
                break;
            case "5mukhi": holder.imageLabelOne.setText(R.string.five_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.five);
                break;
            case "6mukhi": holder.imageLabelOne.setText(R.string.six_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.six);
                break;
            case "7mukhi": holder.imageLabelOne.setText(R.string.seven_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.seven);
                break;
            case "8mukhi": holder.imageLabelOne.setText(R.string.eight_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.eight);
                break;
            case "9mukhi": holder.imageLabelOne.setText(R.string.nine_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.nine);
                break;
            case "10mukhi": holder.imageLabelOne.setText(R.string.ten_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.ten);
                break;
            case "11mukhi": holder.imageLabelOne.setText(R.string.eleven_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.eleven);
                break;
            case "12mukhi": holder.imageLabelOne.setText(R.string.twelve_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.twelve);
                break;
            case "13mukhi": holder.imageLabelOne.setText(R.string.thirteen_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.thirteen);
                break;
            case "14mukhi": holder.imageLabelOne.setText(R.string.fourteen_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.fourteen);
                break;
            case "gaurishankar": holder.imageLabelOne.setText(R.string.fifteen_mukhi);
                holder.imageViewOne.setImageResource(R.drawable.gauri_shankar);
                break;
            case "ganesh": holder.imageLabelOne.setText(R.string.ganesh);
                break;
            default: holder.imageLabelOne.setText("Default");
                holder.imageViewOne.setImageResource(R.mipmap.ic_launcher);

        }

        switch (list.get(position).getMukhiName(1))
        {
            case "1mukhi": holder.imageLabelTwo.setText(R.string.one_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.one);
                break;
            case "2mukhi": holder.imageLabelTwo.setText(R.string.two_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.two);
                break;
            case "3mukhi": holder.imageLabelTwo.setText(R.string.three_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.three);
                break;
            case "4mukhi": holder.imageLabelTwo.setText(R.string.four_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.four);
                break;
            case "5mukhi": holder.imageLabelTwo.setText(R.string.five_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.five);
                break;
            case "6mukhi": holder.imageLabelTwo.setText(R.string.six_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.six);
                break;
            case "7mukhi": holder.imageLabelTwo.setText(R.string.seven_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.seven);
                break;
            case "8mukhi": holder.imageLabelTwo.setText(R.string.eight_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.eight);
                break;
            case "9mukhi": holder.imageLabelTwo.setText(R.string.nine_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.nine);
                break;
            case "10mukhi": holder.imageLabelTwo.setText(R.string.ten_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.ten);
                break;
            case "11mukhi": holder.imageLabelTwo.setText(R.string.eleven_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.eleven);
                break;
            case "12mukhi": holder.imageLabelTwo.setText(R.string.twelve_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.twelve);
                break;
            case "13mukhi": holder.imageLabelTwo.setText(R.string.thirteen_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.thirteen);
                break;
            case "14mukhi": holder.imageLabelTwo.setText(R.string.fourteen_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.fourteen);
                break;
            case "gaurishankar": holder.imageLabelTwo.setText(R.string.fifteen_mukhi);
                holder.imageViewTwo.setImageResource(R.drawable.gauri_shankar);
                break;
            case "ganesh": holder.imageLabelTwo.setText(R.string.ganesh);
                break;
            default: holder.imageLabelTwo.setText("Default");
                holder.imageViewTwo.setImageResource(R.mipmap.ic_launcher);

        }

        switch (list.get(position).getMukhiName(2))
        {
            case "1mukhi": holder.imageLabelThree.setText(R.string.one_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.one);
                break;
            case "2mukhi": holder.imageLabelThree.setText(R.string.two_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.two);
                break;
            case "3mukhi": holder.imageLabelThree.setText(R.string.three_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.three);
                break;
            case "4mukhi": holder.imageLabelThree.setText(R.string.four_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.four);
                break;
            case "5mukhi": holder.imageLabelThree.setText(R.string.five_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.five);
                break;
            case "6mukhi": holder.imageLabelThree.setText(R.string.six_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.six);
                break;
            case "7mukhi": holder.imageLabelThree.setText(R.string.seven_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.seven);
                break;
            case "8mukhi": holder.imageLabelThree.setText(R.string.eight_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.eight);
                break;
            case "9mukhi": holder.imageLabelThree.setText(R.string.nine_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.nine);
                break;
            case "10mukhi": holder.imageLabelThree.setText(R.string.ten_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.ten);
                break;
            case "11mukhi": holder.imageLabelThree.setText(R.string.eleven_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.eleven);
                break;
            case "12mukhi": holder.imageLabelThree.setText(R.string.twelve_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.twelve);
                break;
            case "13mukhi": holder.imageLabelThree.setText(R.string.thirteen_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.thirteen);
                break;
            case "14mukhi": holder.imageLabelThree.setText(R.string.fourteen_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.fourteen);
                break;
            case "gaurishankar": holder.imageLabelThree.setText(R.string.fifteen_mukhi);
                holder.imageViewThree.setImageResource(R.drawable.gauri_shankar);
                break;
            case "ganesh": holder.imageLabelThree.setText(R.string.ganesh);
                    holder.imageViewThree.setImageResource(R.mipmap.ic_launcher_round);
                break;
            case "null": holder.lThree.setVisibility(View.GONE);
                break;
            default: holder.imageLabelThree.setText("Default");
                holder.imageViewThree.setImageResource(R.mipmap.ic_launcher);

        }





        holder.quantityOne.setText(String.valueOf(list.get(position).getMukhiQuantitity(0)));
        holder.quantityTwo.setText(String.valueOf(list.get(position).getMukhiQuantitity(1)));
        if (list.get(position).getMukhiQuantitity(2) == 0) {
            holder.lThree.setVisibility(View.GONE);
        }
        else {
            holder.lThree.setVisibility(View.VISIBLE);
            holder.quantityThree.setText(String.valueOf(list.get(position).getMukhiQuantitity(2)));
        }

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.view.getVisibility() == View.GONE) {
                    holder.view.setVisibility(View.VISIBLE);
                } else if (holder.view.getVisibility() == View.VISIBLE) {
                    holder.view.setVisibility(View.GONE);
                }
            }
        });


        }


    @Override
    public int getItemCount() {
        return list.size();
    }
}












