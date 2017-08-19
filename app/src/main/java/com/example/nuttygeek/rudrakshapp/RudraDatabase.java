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


    String   tableName = "rudra";
    String[] mukhi = {"1 Mukhi","2 Mukhi","3 Mukhi","4 Mukhi","5 Mukhi","6 Mukhi","7 Mukhi","8 Mukhi","9 Mukhi","10 Mukhi","11 Mukhi","12 Mukhi","13 Mukhi","14 Mukhi","Gauri Shankar"};
    String[] planet = {"Sun","Moon","Mars","Mercury","Jupiter","Venus","Saturn","Rahu","Ketu","null","null","Sun","Venus","Saturn","Moon"};
    String[] god = {"Lord Shiva","Shiva & Parvati","Agnidev","Lord Brahma","Kalagni","Kartikey","Goddess Laxmi","Lord Ganesh","Goddess Durga","Lord Vishnu","Lord Hanuman","Surya Dev","Kamadev & Indra","Dev Mani","Shiva & Parvati"};
    String[] mantra = {"Om Hreeem Namha ","Om Namhh","Om kleem Namh","Om Hreem Namah","Om Hreem Namaha","Om Hreem Hoom Namah"
            ,"Om Hoom Namahh","Om Hoom Namah","Om Hreeem Hoom Namah","Om Hreem Namaha","Om Hreem Hoom Namaha","Om Kraum Sraum Raum Namaha"
            ,"Om Hreem Namaha","Om Namaha","Om Gauri shunkraaye Namaha"};
    int []   sno = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    String[] mantraHindi = {"ओम ह्रीम नमः","ओम नमः","ओम क्लीम नामः","ओम ह्रीम नमः","ओम ह्रीम नमः","ओम ह्रीम हूम नमः",
    "ओम हूम नमः","ओम हूम नमः","ओम ह्रीम हूम नमः","ओम ह्रीम नमः","ओम ह्रीम हूम नमः","ओम क्रौम स्राओम रौम नमः",
    "ओम ह्रीम नमः","ओम नमः","ओम गौरी शंकरार्य नमः"};


    public RudraDatabase(Context context ,String dbName) {
        super(context,dbName,null,1);
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
            values.put("mukhi",mukhi[i]);
            values.put("planet",planet[i]);
            values.put("god",god[i]);
            values.put("mantra",mantra[i]);
            values.put("mantrahindi",mantraHindi[i]);

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
        Log.i("ankur","gotData: "+c.getString(0)+c.getString(1)+c.getString(2)+c.getString(3)+c.getString(4)+c.getString(5));

        sNo = c.getInt(0);
        mukhi = c.getString(1);
        planet = c.getString(2);
        god = c.getString(3);
        mantra = c.getString(4);
        mantraH = c.getString(5);

        c.close();

        return new RudrakshPOJO(sNo,mukhi,planet,god,mantra,mantraH);


    }

}
