package com.example.first_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box // Importación del Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.first_project.navegation.AppNavegation
import com.example.first_project.ui.theme.First_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            First_projectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Usamos el Box para aplicar el padding del Scaffold
                    Box(modifier = Modifier.padding(innerPadding)) {
                        AppNavegation()
                    }
                }
            }
        }
    }
}