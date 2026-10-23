// Routes.kt (o el archivo donde tengas Inicio, Productos, etc.)
package com.example.first_project.navegation

import kotlinx.serialization.Serializable

@Serializable
object Inicio

@Serializable
object Productos

@Serializable
data class DetalleProducto(val id: Int)

// Nuevas rutas:
@Serializable
object Perfil

@Serializable
object Configuracion