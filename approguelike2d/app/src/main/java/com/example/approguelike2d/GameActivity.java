package com.example.approguelike2d;

import android.os.Bundle;
import android.util.Log;

import com.Company.primerjuego.UnityPlayerActivity;


public class GameActivity extends UnityPlayerActivity {
    @Override
    protected void onCreate(Bundle arg0) {
        // TODO Auto-generated method stub
        super.onCreate(arg0);
        Log.d("Unity", "Unity started");
    }
}
