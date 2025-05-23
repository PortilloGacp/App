package com.example.fiap_grupo_69.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fiap_grupo_69.R

@Composable
fun HomeScreen(navController: NavController) {


    Box(
        modifier = Modifier
            .background(
                color = Color(0xffaaaaaa)
            )
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xff000000)),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(R.drawable.vagasdeemprego),
                        contentDescription = "Imagem de fundo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.matchParentSize()
                    )

                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .background(Color(0xB33B0A9E)) // Máscara roxa com 70% de transparência
                    )

                    Text(
                        text = "Vagas de Emprego",
                        fontSize = 32.sp,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
            Card(
                shape = RoundedCornerShape(
                    topStart = 50.dp,
                    topEnd = 50.dp
                ),
                modifier = Modifier
                    .fillMaxSize()
                    .offset(y = -40.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff000000))
                        .padding(28.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .padding(
                                top = 10.dp
                            )
                    ) {
                        Text(
                            text = "Vagas em destaque",
                            fontSize = 30.sp,
                            color = Color(0xffFFFFFF)
                        )
                    }

                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(
                                top = 40.dp
                            )
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.logodhl),
                                contentDescription = "Imagem de fundo",
                                modifier = Modifier
                                    .size(100.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(
                                        start = 15.dp
                                    )
                            ) {
                                Text(
                                    text = "Assistente Logistico",
                                    fontSize = 20.sp
                                )
                                Text(
                                    text = "8-17h / seg-sex",
                                    fontSize = 20.sp
                                )
                                Text(
                                    text = "Saiba Mais ->",
                                    fontSize = 20.sp
                                )
                            }
                        }

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(
                                    top = 40.dp
                                )
                        ) {
                            Image(
                                painter = painterResource(R.drawable.logoatacadao),
                                contentDescription = "Imagem de fundo",
                                modifier = Modifier
                                    .size(100.dp)
                            )
                            Column(
                                modifier = Modifier
                                    .padding(
                                        start = 15.dp
                                    )
                            ) {
                                Text(
                                    text = "Assistente Logistico",
                                    fontSize = 20.sp
                                )
                                Text(
                                    text = "8-16h / seg-sab",
                                    fontSize = 20.sp
                                )
                                Text(
                                    text = "Saiba Mais ->",
                                    fontSize = 20.sp
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .padding(
                                    top = 20.dp
                                )
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                                onClick = {
                                    navController.navigate("Menu")
                                }

                            ) {
                                Text(
                                    text = "Ver Todas",
                                    fontSize = 20.sp
                                )
                            }

                        }

                    }

                }

            }
        }
    }

    Box(

        modifier = Modifier

            .fillMaxSize()

            .padding(bottom = 16.dp),

        contentAlignment = Alignment.BottomCenter

    ) {

        Row(

            modifier = Modifier

                .fillMaxWidth()

                .background(color = Color(0xFF313131))

                .padding(8.dp),

            horizontalArrangement = Arrangement.SpaceEvenly

        ) {

            IconButton(onClick = { navController.navigate("Menu") }) {

                Icon(painter = painterResource(id = R.drawable.iconehome), contentDescription = "Menu", tint = Color.White)

            }

            IconButton(onClick = { navController.navigate("Vagas") }) {

                Icon(painter = painterResource(id = R.drawable.iconevagas), contentDescription = "Vagas", tint = Color.White)

            }

            IconButton(onClick = { navController.navigate("Perfil") }) {
                Icon(painter = painterResource(id = R.drawable.iconeperfil), contentDescription = "Perfil", tint = Color.White)

            }

        }

    }
}

