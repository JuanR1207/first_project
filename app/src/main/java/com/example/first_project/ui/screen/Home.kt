package com.example.first_project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Home(
    onirProducto: () -> Unit,
    onIrPerfil: () -> Unit,
    onIrConfiguracion: () -> Unit // 1. Nuevo parámetro para configuración
){
    Column {
        Text(text = "Hola desde Home")

        Button(onClick = { onirProducto() }) {
            Text(text = "ir a producto")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { onIrPerfil() }) {
            Text(text = "Ir a Perfil")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // 2. Nuevo botón para ir a la configuración
        Button(onClick = { onIrConfiguracion() }) {
            Text(text = "Ir a Configuración")
        }
    }
}