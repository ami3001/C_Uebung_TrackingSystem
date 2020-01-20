package com.example.c_uebung_trackingsystem;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Activity2 extends SQLiteOpenHelper {

    public static final String DB_NAME ="C_Uebung";
    public static final int DB_VERSION=1;

    public Activity2(Context context){super(context,DB_NAME,null,DB_VERSION);}
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("Create table Trackingdb (longitude,latitude,myDate,time)");
        sqLiteDatabase.execSQL("INSERT INTO Trackingdb(longitude,latitude,myDate,time) VALUES (32.2344,19958.8888,'12.01.20','12:00')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
