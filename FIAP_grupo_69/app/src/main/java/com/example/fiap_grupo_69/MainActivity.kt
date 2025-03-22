package com.example.fiap_grupo_69

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fiap_grupo_69.screens.CriarContaScreen
import com.example.fiap_grupo_69.screens.HomeScreen
import com.example.fiap_grupo_69.screens.LoginScreen
import com.example.fiap_grupo_69.screens.PerfilScreen
import com.example.fiap_grupo_69.screens.TodasVagasScreen
import com.example.fiap_grupo_69.ui.theme.FIAP_grupo_69Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FIAP_grupo_69Theme {

                Surface(modifier = Modifier.fillMaxSize()) {
                }
                val navcontroller = rememberNavController()
                NavHost(navController = navcontroller, startDestination = "Login"){
                    composable(route = "Login"){
                        LoginScreen(navcontroller)
                    }
                    composable(route = "Cadastro"){
                        CriarContaScreen(navcontroller)
                    }
                    composable(route = "Menu"){
                        HomeScreen( navcontroller)
                    }
                    composable(route = "Vagas"){
                        TodasVagasScreen( navcontroller)
                    }
                    composable(route = "Perfil"){
                        PerfilScreen( navcontroller)
                    }


                }
            }
        }
    }
}
