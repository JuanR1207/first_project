package com.example.first_project.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.first_project.ui.screen.Configuracion
import com.example.first_project.ui.screen.DetalleProducto as DetalleProductoScreen
import com.example.first_project.ui.screen.Home
import com.example.first_project.ui.screen.Perfil
import com.example.first_project.ui.screen.Producto

@Composable
fun AppNavegation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Inicio,
        modifier = modifier
    ) {
        // Ruta de Inicio (Home)
        composable<Inicio> {
            Home(
                onirProducto = {
                    navController.navigate(route = Productos)
                },
                onIrPerfil = {
                    navController.navigate(route = Perfil)
                },
                onIrConfiguracion = { // Nueva instrucción de navegación agregada
                    navController.navigate(route = Configuracion)
                }
            )
        }

        // Ruta de Productos
        composable<Productos> {
            Producto(
                onirDetalleProducto = { id ->
                    navController.navigate(route = DetalleProducto(id = id))
                },
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }

        // Ruta de Detalle del Producto
        composable<DetalleProducto> { backStackEntry ->
            val routeData = backStackEntry.toRoute<DetalleProducto>()
            DetalleProductoScreen(
                id = routeData.id
            )
        }

        // Ruta de Perfil
        composable<Perfil> {
            Perfil(
                onVolver = {
                    navController.popBackStack()
                }
            )
        }

        // Ruta de Configuración
        composable<Configuracion> {
            Configuracion(
                onVolver = {
                    navController.popBackStack()
                }
            )
        }
    }
}