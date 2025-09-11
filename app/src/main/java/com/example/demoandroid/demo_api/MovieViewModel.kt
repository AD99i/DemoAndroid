package com.example.demoandroid.demo_api

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MovieViewModel  : ViewModel(){
    var movies = MutableStateFlow<List<Movie>>(mutableListOf())

    fun callMovieApi(){
        //il faut lancer une tache asynchrone
        viewModelScope.launch{

            //appel API
            //on ecrase la liste des films par celles recuperees via l'API
            movies.value = MovieService.MovieServiceApi.movieService.getMovies()
        }
    }
}