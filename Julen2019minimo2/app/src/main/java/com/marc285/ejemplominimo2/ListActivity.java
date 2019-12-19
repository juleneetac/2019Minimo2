package com.marc285.ejemplominimo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.marc285.ejemplominimo2.models.Museums;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListActivity extends AppCompatActivity {

    private ProgressBar listProgress;
    private RecyclerView museumslistRV;

    private MuseumsAPI APIinterface; //Interface of the API methods

    public void loadMuseums(){


        //final MuseumsAPI service = MuseumsAPI.retrofit.create(MuseumsAPI.class);
        //Call<Museums> call = service.museums(1, 1000);    si el MuseusmAPI tengo un metodo que le meto variables

        Call<Museums> call = APIinterface.getMuseums();
        call.enqueue(new Callback<Museums>() {
            @Override
            public void onResponse(Call<Museums> call, Response<Museums> response) {
                if(response.isSuccessful()){
                    Museums museums = response.body();   //aqui le paso lo de la clase Museums todo lo que hay
                    museumslistRV.setAdapter(new RVAdapter(museums.getElements()));
                }
                else
                    Toast.makeText(getApplicationContext(), "Error Code: " + response.code(), Toast.LENGTH_LONG).show();
                showProgress(false);
            }
            @Override
            public void onFailure(Call<Museums> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Error Code: " + t.getMessage(), Toast.LENGTH_LONG).show();
                showProgress(false);
            }
        });
    }



    public void showProgress (boolean visible){
        //Sets the visibility/invisibility of the ProgressBar
        if(visible)
            this.listProgress.setVisibility(View.VISIBLE);
        else
            this.listProgress.setVisibility(View.GONE);
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listProgress = findViewById(R.id.listProgressBar);
        museumslistRV = findViewById(R.id.museumslistRecyclerView);



        //Retrofit Builder
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://do.diba.cat/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIinterface = retrofit.create(MuseumsAPI.class);    //LE DOY VALOR A LA VARIABLE APIinterface
        //anton lo hace dentro del update

        //prepara ReciclerView
        museumslistRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


        //usa el loadMuseums()
        loadMuseums();
    }
}
