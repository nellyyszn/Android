package com.example.nellyy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellyy.ui.theme.NellyyTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardDemo(){

    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {

        //TopAppBar
        TopAppBar(title = { Text(text = "Homepage", color = Color.Blue, fontSize = 25.sp, fontWeight = FontWeight.Bold)},
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {  mContext.startActivity(Intent(mContext,IntentActivity::class.java))}) {
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
            }
        )

        Text(
            text = "Dashboard",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 100.dp))

        Text(text = "Types of Dogs",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)

        //Row 1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_4),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "bulldog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Bulldog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Siberian Husky",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.retriver),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Retriver",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Social Media Platforms",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row 2
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Whatsapp",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Twitter",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_6),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Facebook",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Instagram",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_6),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "Tiktok",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }


        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "cars",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row 3
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            Card(modifier = Modifier
                .size(200.dp,)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "saloon",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "cx5",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "serena",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "raum",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(modifier = Modifier
                .size(200.dp)
                .padding(10.dp)){
                Column(modifier = Modifier.padding(20.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "", modifier = Modifier.size(100.dp))
                    Text(text = "jux",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = {
            mContext.startActivity(Intent(mContext,Imageactivity::class.java))
        },
            shape = CutCornerShape(5.dp),
            modifier = Modifier.padding(start = 150.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "Next")
        }


    }

}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}