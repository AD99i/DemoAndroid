package com.example.demoandroid.demo_2

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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainPage()
        }
    }
}

@Composable
fun MainPage(){
    // TODO: Comment faire pour injecter du designer dans un composer/composant a nous
    TemplatePage {
        Column(modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 250.dp)) {
            Text("Hello Chocolatine")
            Text("Incroyable Bulk")
            TextField(value = "", onValueChange = {}, placeholder = {
                Text("Veuillez saisir une information")
            })
            ElevatedButton(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Envoyer le formulaire")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainPage()
}