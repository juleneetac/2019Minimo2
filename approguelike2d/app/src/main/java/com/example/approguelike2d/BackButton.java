package com.example.approguelike2d;
import com.example.approguelike2d.UnityPlayerActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class BackButton extends UnityPlayerActivity {

    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_button);

// DON'T CALL IT FROM YOUR MAIN ACTIVITY - SEE ABOVE INSTRUCTIONS!
        Intent intent = new Intent(mContext, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
