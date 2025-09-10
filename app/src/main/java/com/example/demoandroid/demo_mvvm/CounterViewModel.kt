package com.example.demoandroid.demo_mvvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class CounterViewModel : ViewModel() {
    //compteur entier ECOUTABLE
    var counter = MutableStateFlow<Int>(1)

    //fonction pour incrementer le compteur
    fun incrementCounter() {
        counter.value += 1
    }
}