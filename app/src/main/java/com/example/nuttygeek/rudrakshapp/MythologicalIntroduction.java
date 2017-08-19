package com.example.nuttygeek.rudrakshapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nuttygeek on 11/8/17.
 */

public class MythologicalIntroduction extends android.support.v4.app.Fragment{

    public MythologicalIntroduction() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.mythological_introduction,container,false);

        TextView mythText = (TextView)v.findViewById(R.id.myth_text);
        mythText.setText(R.string.chemical_text);
        return v;
    }

}
