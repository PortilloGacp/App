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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fiap_grupo_69.R

@Composable
fun PerfilScreen(navController: NavController) {

    var yourNameState = remember {
        mutableStateOf("Nome")
    }

    Box(
        modifier = Modifier
            .background(
                color = Color(0xffaaaaaa)
            )
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xff000000)),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(270.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .background(Color(0xB33B0A9E))
                    )

                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.iconeperfil),
                            contentDescription = "Imagem de fundo",
                            modifier = Modifier
                                .size(150.dp)
                                .padding(start = 30.dp)
                        )
                        Text(
                            text="Bem vindo, Teste da Silva",
                            fontSize=25.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color(0xffFFFFFF),
                            modifier = Modifier
                                .padding(
                                    start = 20.dp
                                )
                        )
                    }
                }
            }
            Card (
                shape = RoundedCornerShape(
                    topStart = 50.dp,
                    topEnd = 50.dp
                ),
                modifier = Modifier
                    .fillMaxSize()
                    .offset(y = -40.dp)
            ){
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xff000000))
                        .padding(28.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Column (
                        modifier = Modifier
                            .padding(
                                top = 10.dp
                            )
                    ){
                        Text(
                            text = "Dados:",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 30.sp,
                            color = Color(0xffFFFFFF)
                        )
                    }

                    Column (
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(
                                top = 40.dp
                            )
                    ){
                        Column {
                            TextField(
                                value = yourNameState.value,
                                onValueChange = { valor ->
                                    yourNameState.value = valor
                                },
                                modifier = Modifier
                                    .fillMaxWidth(),
                            )
                        }
                        Column (
                            modifier = Modifier
                                .padding(
                                    top = 20.dp
                                )
                        ){
                            TextField(
                                value = "E-mail",
                                onValueChange = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                        Column  (
                            modifier = Modifier
                                .padding(
                                    top = 20.dp
                                )
                        ){
                            TextField(
                                value = "Telefone",
                                onValueChange = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                        Column  (
                            modifier = Modifier
                                .padding(
                                    top = 20.dp
                                )
                        ){
                            TextField(
                                value = "CPF",
                                onValueChange = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                        Column  (
                            modifier = Modifier
                                .padding(
                                    top = 20.dp
                                )
                        ){
                            TextField(
                                value = "Senha",
                                onValueChange = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }

                        Column (
                            modifier = Modifier
                                .padding(
                                    top = 20.dp
                                )
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Button(
                                onClick = {}

                            ) {
                                Text(
                                    text="Editar dados",
                                    fontSize=20.sp
                                )
                            }
                            Button(
                                onClick ={ navController.navigate("Login")}
                            ) {
                                Text(
                                    text = "Sair",
                                    fontSize=20.sp,
                                    
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
