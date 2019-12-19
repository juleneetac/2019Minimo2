package com.marc285.ejemplominimo2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import static android.app.PendingIntent.getActivity;

public class Login extends AppCompatActivity {
    private EditText etUser;
    private EditText etPass;

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        etUser = (EditText) findViewById(R.id.editUsername);
        etPass = (EditText) findViewById(R.id.editPassword);

        preferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void guardarLog(View view){
            String user = etUser.getText().toString();
            String password = etPass.getText().toString();

            editor.putString("userP", user);
            editor.putString("passP", password);

            editor.commit();

            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
        }

    }



