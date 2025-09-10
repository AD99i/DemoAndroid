package com.example.demoandroid.demo_mvvm

import TemplatePage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.MutableStateFlow

class DemoMVVMActivity : ComponentActivity() {

    lateinit var viewModel : CounterViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //instancier view model
        viewModel = CounterViewModel()
        setContent {
            DemoMVVMPage(viewModel)
        }
    }
}
@Composable
fun DemoMVVMPage(viewModel: CounterViewModel) {
    // ecouter les changments de la variable counter
    val counterState by viewModel.counter.collectAsState()


    TemplatePage {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(60.dp)
                .padding(top = 250.dp)) {
            Text("Demo MVVM")
            Text("Valeur du compteur: ${counterState}")
            ElevatedButton(onClick = {
                //incrementer le compteur
                viewModel.incrementCounter()
            },
                modifier = Modifier.fillMaxWidth()) {
                Text("Incrementer le compteur")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DemoMVVMPagePreview() {
    //viewModel fictif pour l'aperçu
    DemoMVVMPage(CounterViewModel())
}
