package com.udeh.markethub.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Rodger.markethub.ui.theme.newgreen
import com.udeh.markethub.R


@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier.fillMaxSize()

    )
    {
        Image(
            painter = painterResource(R.drawable.login),
            contentDescription = "product",
            modifier = Modifier.size(100.dp),


            )

    }
    Spacer(modifier = Modifier.size(50.dp))

    //variables
    var username by remember { mutableStateOf("") }



    OutlinedTextField(
        value = username,
        onValueChange = { username= it  },
        modifier = Modifier.width(350.dp),
        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
        label ={ Text(text = "username")},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.DarkGray,
            focusedTextColor = Color.Gray,
            unfocusedLeadingIconColor = newgreen


        )

    )

}

@Preview(showBackground = true)
@Composable
fun loginScreenPreview(){
    LoginScreen()

}