package com.ekaterinachubarova.gifsearchapp.rest.api;

import com.ekaterinachubarova.gifsearchapp.rest.model.GifsLab;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
public interface GifService {
    @GET("v1/gifs/trending?api_key=dc6zaTOxFJmzC")
    Call<GifsLab> repoGifs();
    //Call<FilmsLab> repoFilms();


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://api.giphy.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}