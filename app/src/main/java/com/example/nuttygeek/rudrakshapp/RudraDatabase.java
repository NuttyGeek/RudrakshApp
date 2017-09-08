package com.example.nuttygeek.rudrakshapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.Collections;
import java.util.List;

/**
 * Created by nuttygeek on 12/8/17.
 */

public class RudraDatabase extends SQLiteOpenHelper {

    Context context;


    String   tableName = "rudra";
    int[] mukhi = {R.string.one_mukhi,R.string.two_mukhi,R.string.three_mukhi,R.string.four_mukhi,R.string.five_mukhi,R.string.six_mukhi,
            R.string.seven_mukhi,R.string.eight_mukhi,R.string.nine_mukhi,R.string.ten_mukhi,R.string.eleven_mukhi,R.string.twelve_mukhi,
            R.string.thirteen_mukhi,R.string.fourteen_mukhi,R.string.fifteen_mukhi};
    int[] planet = {R.string.sun,R.string.moon,R.string.mars,R.string.mercury,R.string.jupiter,R.string.venus,R.string.saturn
            ,R.string.rahu,R.string.ketu,R.string.nill,R.string.nill,R.string.sun,R.string.venus,R.string.saturn,R.string.moon};
    int [] god = {R.string.lord_shiva,R.string.shiva_parvati, R.string.agnidev,R.string.brahma,R.string.kalagni
            ,R.string.kartikey,R.string.laxmi,R.string.ganesha,R.string.durga,R.string.vishnu,R.string.hanuman,
            R.string.suryadev,R.string.rahu, R.string.dev_mani,R.string.shiva_parvati};
    int[] mantra = {R.string.man_one,R.string.man_two,R.string.man_three,R.string.man_four,R.string.man_five,R.string.man_six,R.string.man_seven,
        R.string.man_eight,R.string.man_nine,R.string.man_ten,R.string.man_eleven,R.string.man_twelve,R.string.man_thirteen,R.string.man_fourteen,R.string.man_fifteen};
    int [] sno = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int[] mantraHindi ={
      R.string.man_ek,R.string.man_do,R.string.man_teen,R.string.man_chaar,R.string.man_panch,R.string.man_she,R.string.man_saat,R.string.man_aath
            ,R.string.man_nau,R.string.man_das,R.string.man_gyara,R.string.man_baarah,R.string.man_tehra,R.string.man_chauda,R.string.man_pandra
    };


    public RudraDatabase(Context context ,String dbName) {
        super(context,dbName,null,1);
        this.context=context;

    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        // create database for first time
         String create = "create table "+tableName+" (sno integer,mukhi varchar(20),planet varchar(20),god varchar(20),mantra varchar(50),mantrahindi varchar(50))";
        db.execSQL(create);
        // enter values to the db
        for(int i=0;i<15;i++)
        {
            ContentValues values = new ContentValues();
            values.put("sno",sno[i]);
            values.put("mukhi",context.getString(mukhi[i]));
            values.put("planet",context.getString(planet[i]));
            values.put("god",context.getString(god[i]));
            values.put("mantra",context.getString(mantra[i]));
            values.put("mantrahindi",context.getString(mantraHindi[i]));

            db.insert(tableName,null,values);
        }


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public RudrakshPOJO getData(int sno)
    { int sNo;
        String planet,god,mukhi,mantra,mantraH;

        SQLiteDatabase readableDB = this.getReadableDatabase();
        // String table, String[] columns, String selection,String[] selectionArgs, String groupBy, String having, String orderBy
        Cursor c = readableDB.query("rudra",null,"sno=?",new String[]{String.valueOf(sno)},null,null,null,null);
        c.moveToFirst();
//        Log.i("ankur","gotData: "+c.getString(0)+c.getString(1)+c.getString(2)+c.getString(3)+c.getString(4)+c.getString(5));

        sNo = c.getInt(0);
        mukhi = c.getString(1);
        planet = c.getString(2);
        god = c.getString(3);
        mantra = c.getString(4);
        mantraH = c.getString(5);

        Log.i("ankur","got data: "+sNo+mukhi+planet+god+mantra+mantraH);
        c.close();

        return new RudrakshPOJO(sNo,mukhi,planet,god,mantra,mantraH);


    }

}
