package com.udeh.markethub.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.udeh.markethub.R

@Composable
fun OnboardingScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "product",
            modifier = Modifier.size(100.dp),

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "WELCOME TO MARKETHUB",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Cyan,
            fontFamily = FontFamily.Monospace
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Shop Smarter",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Everywhere You Go",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "“Welcome to MarketHub — your one-stop shop for everything you need." +
                    "Wireless Bluetooth Headphones”\n" +
                    "Men’s Casual Sneakers”\n" +
                    "Smartphone 128GB Dual SIM",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.width(350.dp)
        ) {
            Text(text = "shop now")
        }






    }

}

@Preview(showBackground = true)
@Composable
fun OnboardingScreenPreview(){
    OnboardingScreen() //The function has to be called for the screen to be viewed

}