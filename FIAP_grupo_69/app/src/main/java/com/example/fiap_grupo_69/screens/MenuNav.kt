package com.example.fiap_grupo_69.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.navigation.NavController

@Composable

fun MenuNav(navController: NavController.Companion) {

    Box(

        modifier = Modifier

            .fillMaxSize()

            .padding(bottom = 16.dp),

        contentAlignment = Alignment.BottomCenter

    ) {

        Row(

            modifier = Modifier

                .fillMaxWidth()

                .background(MaterialTheme.colorScheme.primary)

                .padding(8.dp),

            horizontalArrangement = Arrangement.SpaceEvenly

        ) {

            IconButton(onClick = { navController.navigate("Menu") }) {

                Icon(Icons.Default.Home, contentDescription = "Home", tint = Color.White)

            }

            IconButton(onClick = { navController.navigate("Vagas") }) {

                Icon(Icons.Default.Favorite, contentDescription = "Vagas", tint = Color.White)

            }

            IconButton(onClick = { navController.navigate("Perfil") }) {

                Icon(Icons.Default.Person, contentDescription = "Perfil", tint = Color.White)

            }

        }

    }

}

private fun NavController.Companion.navigate(string: String) {}




