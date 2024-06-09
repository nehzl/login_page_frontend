package com.example.simpleloginpage

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier


@Composable
fun loginPage(){
    var email by remember{
        mutableStateOf("")
    }

    var password by remember{
        mutableStateOf("")
    }

    Column(
        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.login), contentDescription = "login image",
            modifier = androidx.compose.ui.Modifier.size(200.dp))

        Text(text = "welcome back", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = androidx.compose.ui.Modifier.height(4.dp))
        Text(text = "login Now")

        Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange ={
           email=it
        }, label = {
            Text(text = "Email Address")

        })
        Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange ={
            password=it
        }, label = {
            Text(text = "Password")

        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = androidx.compose.ui.Modifier.height(16.dp))

        Button(onClick = {
            Log.i("credential","email : $email Password : $password")
        }) {
            Text(text = "Login")
        }

        Spacer(modifier = androidx.compose.ui.Modifier.height(32.dp))

        Text(text = "?Forgot Password?", modifier = androidx.compose.ui.Modifier.clickable {

        })
        Spacer(modifier = androidx.compose.ui.Modifier.height(32.dp))

        Text(text = "Or sign in with")

        Row (modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(id = R.drawable.fb), contentDescription = "fb",
                modifier = androidx.compose.ui.Modifier
                    .size(60.dp)
                    .clickable {
                        //facebook clicked
                    })

            Image(painter = painterResource(id = R.drawable.twitterpng), contentDescription = "twitter",
                modifier = androidx.compose.ui.Modifier
                    .size(60.dp)
                    .clickable {
                        //twitter clicked
                    })
        }
    }

}