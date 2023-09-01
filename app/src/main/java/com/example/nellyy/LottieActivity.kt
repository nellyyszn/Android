package com.example.nellyy

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.nellyy.ui.theme.NellyyTheme

class LottieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mylottie()
        }
    }
}

@Composable
fun mylottie(){
  Column (modifier = Modifier.fillMaxSize()){
      val mContext= LocalContext.current
      val composition by rememberLottieComposition(spec =LottieCompositionSpec.RawRes(R.raw.animation_llyusujh))
      val progress by animateLottieCompositionAsState(composition)

      LottieAnimation(composition, progress,
          modifier = Modifier.size(500.dp))


      Button(onClick = {mContext.startActivity(Intent(mContext,MainActivity::class.java))},
          shape = CutCornerShape(5.dp),
          modifier = Modifier.padding(150.dp),
          colors = ButtonDefaults.buttonColors(Color.Blue)) {
          Text(text = "Next")

      }

  }

}

@Preview(showBackground = true)
@Composable
fun mylottiePreview(){
    mylottie()

}

