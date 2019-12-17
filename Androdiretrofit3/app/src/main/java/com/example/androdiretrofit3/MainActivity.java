package com.example.androdiretrofit3;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//import static com.example.retrofitex.GitHubService.retrofit;

public class MainActivity extends AppCompatActivity {  // es co o el list activity del anton




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                GitHubService gitHubService = GitHubService.retrofit.create(GitHubService.class);
                //final Call<List<Contributor>> call = gitHubService.repoContributors("juleneetac", "webrepos")
                final EditText editText = (EditText) findViewById(R.id.user);
                final Call<Contributor> call = gitHubService.repoContributors(editText.getText().toString());  //ya no es una lista, le quito el List
                // List<Contributor> result = call.execute().body();        //arriba el valor a la funcion del githubservuce

                call.enqueue(new Callback<Contributor>() {
                    @Override
                    public void onResponse(Call<Contributor> call, Response<Contributor> response) {
                        final TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText(response.body().toString());
                    }
                    @Override
                    public void onFailure(Call<Contributor> call, Throwable t) {
                        final TextView textView = (TextView) findViewById(R.id.textView);
                        textView.setText("Something went wrong: " + t.getMessage());
                    }
                });
            }
        });
/**
 FloatingActionButton fab = findViewById(R.id.fab);
 fab.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View view) {
Snackbar.make(view, "Super fast hello world", Snackbar.LENGTH_LONG)
.setAction("Action", null).show();
}
});
 */
    }

    public MainActivity() throws IOException {}  //excepcion para el execute




/**

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
 // Inflate the menu; this adds items to the action bar if it is present.
 getMenuInflater().inflate(R.menu.menu_main, menu);
 return true;
 }

 @Override
 public boolean onOptionsItemSelected(MenuItem item) {
 // Handle action bar item clicks here. The action bar will
 // automatically handle clicks on the Home/Up button, so long
 // as you specify a parent activity in AndroidManifest.xml.
 int id = item.getItemId();

 //noinspection SimplifiableIfStatement
 if (id == R.id.action_settings) {
 return true;
 }

 return super.onOptionsItemSelected(item);
 }
 */

}