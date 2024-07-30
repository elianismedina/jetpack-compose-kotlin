package com.elianisdev.myfirstkotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Main activity class

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //defines the activity's layout where composable functions are called
        setContent {
            LoginScreen()
        }
    }
}
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.planet),
            contentDescription = "Login Image",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Bienvenido!",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineLarge
        )
        Spacer(modifier = Modifier.size(12.dp))
        Text(text = "Inicia sesión en tu cuenta")
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Correo electrónico") })
        Spacer(modifier = Modifier.size(6.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Contraseña") })
        Spacer(modifier = Modifier.size(12.dp))
        GradientButton(
            text = "Iniciar sesión",
            textColor = Color.White,
            gradient = Brush.horizontalGradient(
                colors = listOf(
                    color1,
                    color2
                )
            )
        ) { }
        Spacer(modifier = Modifier.size(6.dp))
        Text(text = "¿Olvidaste tu contraseña?", modifier = Modifier.clickable {
            //Forgot password
        })
        Spacer(modifier = Modifier.size(32.dp))
        Text(text = "O inicia sesión con")

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxSize().padding(40.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.facebook_color_svgrepo_com),
                contentDescription = "Facebook",
                modifier = Modifier.size(60.dp).clickable {
                    //Facebook login
                })
            Image(painter = painterResource(id = R.drawable.google_color_svgrepo_com),
                contentDescription = "Google",
                modifier = Modifier.size(60.dp).clickable {
                    //Google login
                })
            Image(painter = painterResource(id = R.drawable.twitter_color_svgrepo_com),
                contentDescription = "Twitter",
                modifier = Modifier.size(60.dp).clickable {
                    //Twitter login
                })

        }

    }

    }




//Preview function to display the UI
@Preview( showBackground = true)
@Composable
fun LoginPreview(){
    LoginScreen()

}
