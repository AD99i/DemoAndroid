package com.example.demoandroid.demo_api

import com.example.demoandroid.demo_api.RetrofitTools.Companion.retrofit
import retrofit2.http.GET

interface MovieService {

    @GET("movies.json")
    suspend fun getMovies() : List<Movie>

    object MovieServiceApi{
        //instancier une seul fois MovieService a l'aide de l'utilitaire retrofit
        //il faut utiliser l'utilitaire RetrofitTools pour avoir le contexte de retrofit automatique
        val movieService : MovieService by lazy {
            retrofit.create(MovieService::class.java)
        }
    }
}