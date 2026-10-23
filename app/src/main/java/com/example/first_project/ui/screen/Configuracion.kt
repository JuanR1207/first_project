package com.example.first_project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Configuracion(onVolver: () -> Unit) {
    Column {
        Text(text = "Pantalla de Configuración")
        Button(onClick = { onVolver() }) {
            Text(text = "Volver")
        }
    }
}