package com.example.fiap_grupo_69.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fiap_grupo_69.R

@Composable
fun CriarContaScreen(navController: NavController) {

    var yourNomeState = remember {
        mutableStateOf("Nome")
    }
    var yourEmailState = remember {
        mutableStateOf("E-mail")
    }
    var yourTelefoneState = remember {
        mutableStateOf("Telefone")
    }
    var yourCPFState = remember {
        mutableStateOf("CPF")
    }
    var yourSenhaState = remember {
        mutableStateOf("Senha")
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
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Column (
                        modifier = Modifier
                            .padding(
                                top = 10.dp
                            )
                    ){
                        Text(
                            text = "Crie Conta",
                            fontSize = 30.sp,
                            color = Color(0xffFFFFFF)
                        )
                    }
                    Column {
                        TextField(
                            value = yourNomeState.value,
                            onValueChange = { valor ->
                                yourNomeState.value = valor
                            },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Column {
                        TextField(
                            value = yourEmailState.value,
                            onValueChange = { valor ->
                                yourEmailState.value = valor
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                    Column {
                        TextField(
                            value = yourTelefoneState.value,
                            onValueChange = { valor ->
                                yourTelefoneState.value = valor
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                    Column {
                        TextField(
                            value = yourCPFState.value,
                            onValueChange = { valor ->
                                yourCPFState.value = valor
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                    Column {
                        TextField(
                            value = yourSenhaState.value,
                            onValueChange = { valor ->
                                yourSenhaState.value = valor
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                    Column (
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Button(
                            onClick = {
                                navController.navigate("Menu")
                            }
                        ) {
                            Text(
                                text="Criar Conta",
                                fontSize=20.sp
                            )
                        }
                    }

                }

            }
        }
    }
}

