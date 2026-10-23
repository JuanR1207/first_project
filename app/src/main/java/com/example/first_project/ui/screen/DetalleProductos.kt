package com.example.first_project.ui.screen

import androidx.compose.material3.Text // O androidx.compose.material.Text dependiendo de tu versión
import androidx.compose.runtime.Composable

@Composable
fun DetalleProducto(
    id: Int
){
    Text(
        text = "El id es $id"
    )
}