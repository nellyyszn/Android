package com.example.nellyy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellyy.ui.theme.NellyyTheme

class HomePageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NellyyTheme {

            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun items() {
        val mContext= LocalContext.current
        Column (modifier = Modifier.fillMaxSize()){
            //TopAppBar
            TopAppBar(title = { Text(text = "Homepage", color = Color.Black, fontSize = 25.sp, fontWeight = FontWeight.Bold)},
                colors = TopAppBarDefaults.largeTopAppBarColors(Color.Blue),
                navigationIcon = {
                    IconButton(onClick = {  mContext.startActivity(Intent(mContext,SplashscreenActivity::class.java))}) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="arrowback")
                    }

                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Settings, contentDescription = "settings")
                    }
                })
            Spacer(modifier =Modifier.height(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)){
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Go to Registration",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier =Modifier.height(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .clickable{
                    mContext.startActivity(Intent(mContext,IntentActivity::class.java)) }){
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Veiw products",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier =Modifier.height(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .clickable{
                    mContext.startActivity(Intent(mContext,Imageactivity::class.java))
                }){
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Image Page",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier =Modifier.height(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)){
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(text = "Click to go to",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text ="Intents",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier =Modifier.height(20.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)){
                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Lottie Animation",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun itemsPreview() {
        items()
    }
}