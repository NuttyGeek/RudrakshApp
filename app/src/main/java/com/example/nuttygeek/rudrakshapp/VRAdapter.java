package com.example.nuttygeek.rudrakshapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nuttygeek on 14/8/17.
 */

public class VRAdapter extends RecyclerView.Adapter<VariousRudrakshHolder> {

    Context context;
    int[] mukhi = {R.string.one_mukhi,R.string.two_mukhi, R.string.three_mukhi,R.string.four_mukhi, R.string.five_mukhi,
            R.string.six_mukhi,R.string.seven_mukhi,R.string.eight_mukhi,R.string.nine_mukhi,R.string.ten_mukhi,
            R.string.eleven_mukhi,R.string.twelve_mukhi,R.string.thirteen_mukhi,R.string.fourteen_mukhi,R.string.fifteen_mukhi};

    public VRAdapter(Context context)
    {   super();
        this.context = context;
        }

    @Override
    public VariousRudrakshHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.various_rudraksh_list_item, parent, false);

        VariousRudrakshHolder holder = new VariousRudrakshHolder(v);


        return holder;
    }

    @Override
    public void onBindViewHolder(VariousRudrakshHolder holder, int position) {


        holder.textView.setText(mukhi[position]);


    }

    @Override
    public int getItemCount() {
        return 15;
    }



}