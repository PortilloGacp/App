package com.example.fiap_grupo_69.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fiap_grupo_69.screens.TodasVagasScreen
import com.example.fiap_grupo_69.screens.DescricaoVagaScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "todas_vagas") {
        composable("todas_vagas") { TodasVagasScreen(navController) }
        composable("descricao_vaga") { DescricaoVagaScreen(navController) }
    }
}

