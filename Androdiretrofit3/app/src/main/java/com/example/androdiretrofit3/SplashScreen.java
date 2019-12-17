package com.example.androdiretrofit3;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {      // esta clase es el mainactivity de anton
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 2000);

    }
}
