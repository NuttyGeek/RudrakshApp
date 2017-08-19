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
    String[] mukhi = {"1 Mukhi", "2 Mukhi", "3 Mukhi", "4 Mukhi", "5 Mukhi", "6 Mukhi", "7 Mukhi", "8 Mukhi", "9 Mukhi", "10 Mukhi"
            , "11 Mukhi", "12 Mukhi", "13 Mukhi", "14 Mukhi", "Gauri Shankar"};

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