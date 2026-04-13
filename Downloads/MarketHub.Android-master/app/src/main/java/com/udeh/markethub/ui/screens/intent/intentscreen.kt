package com.udeh.markethub.ui.screens.intent


import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.udeh.markethub.navigation.ROUT_REGISTER
import com.udeh.markethub.ui.theme.Pink40
import com.udeh.markethub.ui.theme.newgreen
import com.udeh.markethub.ui.theme.purple


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun intentScreen(navController: NavController){
    Column(

        modifier = Modifier.fillMaxSize(),

    ) {

val mContext = LocalContext.current
        TopAppBar(
        title ={ Text(text = "Intent")},
        navigationIcon = {
            IconButton(
                onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu"
                ) }
        },

        actions = {




        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.LightGray,
            navigationIconContentColor = newgreen,
            titleContentColor = newgreen,
            actionIconContentColor = newgreen,
        )
    )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {  val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(400.dp)

        ) {
            Text(
                text = "Pay Via Mpesa",
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0717489308".toUri()
                smsIntent.putExtra("sms_body","Am Rodgers how Can i help you?")
                mContext.startActivity(smsIntent) },
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(400.dp)

        ) {
            Text(
                text = "Send Messages",
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="call:0717489308".toUri()
                mContext.startActivity(callIntent)
            },
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(400.dp)

        ) {
            Text(
                text = "Call",
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {   val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }},
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(400.dp)

        ) {
            Text(
                text = "Camera",
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {  val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("kiriakamunge@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent) },
            colors = ButtonDefaults.buttonColors(Pink40),
            shape = RoundedCornerShape(18.dp),
            modifier = Modifier.width(400.dp)

        ) {
            Text(
                text = "Email",
            )
        }



    }

}

@Preview(showBackground = true)
@Composable
fun intentcreenPreview(){
    intentScreen(rememberNavController())

}