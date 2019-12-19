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

        preferences =  Login.this.getPreferences(Context.MODE_PRIVATE);

        String user = preferences.getString("user","incorrect");
        String password = preferences.getString("dsamola","incorrect");

        if(user.equals("user")&&password.equals("dsamola"))
        {
            Intent intent = new Intent(Login.this, ListActivity.class);
            startActivity(intent);
        }
    }



    public void logbuttonfunction(final View view) {
        String user = etUser.getText().toString();
        String password = etPass.getText().toString();

        if (user.equals("user") && password.equals("dsamola")) {

            SharedPreferences sharedPref = Login.this.getPreferences(Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString(etUser.getText().toString(), etUser.getText().toString());
            editor.putString(etPass.getText().toString(), etPass.getText().toString());
            editor.commit();

            Intent intent = new Intent(view.getContext(), ListActivity.class);
            startActivity(intent);
        }

    }
}



