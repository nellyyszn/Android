package com.example.nellyy

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.IconCompat
import com.example.nellyy.ui.theme.NellyyTheme

class Imageactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            myimage()

        }
    }
}

@SuppressLint("NewApi")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myimage() {
    val mContext= LocalContext.current

    Column(modifier =
    Modifier.fillMaxSize()){
    //TopAppBar
    TopAppBar(title = { Text(text = "About", fontWeight = FontWeight.Bold, fontSize = 25.sp) },
        colors = TopAppBarDefaults.largeTopAppBarColors(Color.Green),
        navigationIcon = {
            IconButton(onClick = { mContext.startActivity(Intent(mContext,MainActivity::class.java)) }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription ="ArrowBack" )
            }

        },
        actions = {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings")
            }
        })

        Text(
                text = "BREEDS OF DOGS",
                fontSize = 10.sp,
                color = Color.Black,
                fontFamily = FontFamily.Default,
                modifier = Modifier.padding(start = 30.dp),
                fontWeight = FontWeight.Bold
            )

            //First row
            Row {
                Image(
                    painter = painterResource(id = R.drawable.img_5),
                    contentDescription = "Husky",
                    modifier = Modifier.size(width = 200.dp, height = 150.dp)
                )

                Column {
                    Text(text = "Husky", fontSize = 20.sp)
                    Text(text = "was developed to work in packs, pulling light loads at moderate speed ")
                }
            }


        Spacer(modifier = Modifier.height(20.dp))
        //second row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_3),
                contentDescription = "bulldog",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )
            Column {
                Text(text = "Bulldog", fontSize = 20.sp)
                Text(text = "The Bulldog is a British breed of dog of mastiff type. It may also be known as the English Bulldog or British Bulldog. It is a medium-sized, muscular dog of around 40–55 lb. They have large heads with thick folds of skin around the face and shoulders, and a relatively flat face with a protruding lower jaw. ")
            }

        }
        Spacer(modifier = Modifier.height(20.dp))

//circular image
        Image(painter = painterResource(id = R.drawable.img_5),
            contentDescription ="image",
            modifier = Modifier
                .size(128.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Button(
            onClick = {
                      mContext.startActivity(Intent(mContext,ScrollActivity::class.java))
            },
            shape = CutCornerShape(5.dp),
            modifier = Modifier.padding(start = 150.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text(
                text = "Next"
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun myPreview(){
    myimage()
}

