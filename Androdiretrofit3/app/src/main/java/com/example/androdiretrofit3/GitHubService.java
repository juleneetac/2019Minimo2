package com.example.androdiretrofit3;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    //@GET("repos/{owner}/{repo}/contributors")
    //Call<List<Contributor>> repoContributors(
    //@Path("owner") String owner,
    //@Path("repo") String repo);

    @GET("users/{user}")
    Call<Contributor> repoContributors(    //ya no es una lista, le quito el List
            @Path("user") String user);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}

