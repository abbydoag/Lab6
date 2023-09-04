package com.example.laboratorio6

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio6.ui.theme.Laboratorio6Theme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Gallery()
                }
            }
        }
    }
}

@Composable
fun Gallery( modifier: Modifier = Modifier) {
    val image1 = R.drawable.image1
    val image2 = R.drawable.image2
    val image3 = R.drawable.image3
    val image4 = R.drawable.image4
    val image5 = R.drawable.image5
    val image6 = R.drawable.image6
    val image7 = R.drawable.image7
    val image8 = R.drawable.image8
    val image9 = R.drawable.image9
    val image10 = R.drawable.image10
    var currentImageId by remember { mutableStateOf(1) }

    val text1 = "Portada Animal Crossing New Horizons"
    val text2 = "Portada ACNH Happy Home Paradise"
    val text3 = "Portada Animal Crossing New Leaf"
    val text4 = "ACNH Imagen Promocional"
    val text5 = "ACNH Manga"
    val text6 = "ACNH Amiibo"
    val text7 = "Amiibo Festival"
    val text8 = "Animal Crossing Película"
    val text9 = "Animal Crossing"
    val text10 = "Animal Crossing City Folk"
    var currentTextId by remember { mutableStateOf(1) }

    val authorAndYear1 = "Noriko Ikegawa (2019)"
    val authorAndYear2 = "Yoshihisa Morimoto (2021)"
    val authorAndYear3 = "Ryuji Kobayashi (2012)"
    val authorAndYear4 = "Yoshihisa Morimoto y Noriko Ikegawa (2019)"
    val authorAndYear5 = "Noriko Ikegawa (2020)"
    val authorAndYear6 = "Nintendo (2020)"
    val authorAndYear7 = "Yoshihisa Morimoto (2015)"
    val authorAndYear8 = "Ryuji Kobayashi (2009)"
    val authorAndYear9 = "Ryuji Kobayashi y Noriko Ikegawa (2006)"
    val authorAndYear10 = "Yoshihisa Morimoto y Noriko Ikegawa (2017)"
    var currentInfoID by remember { mutableStateOf(1) }

    val logOut = LocalContext.current
    Column(
        modifier = modifier.fillMaxSize()
    ){
        Button(onClick = {
              logOut.startActivity(Intent(logOut,MainActivity::class.java))
        },
            modifier = modifier
                .align(Alignment.End)
                .padding(3.dp)){
            Icon(
                imageVector = Icons.Outlined.ExitToApp,
                contentDescription = "Logout",
                modifier = modifier
                    .size(35.dp)
            )
        }
        Text(
            text = "Galería",
            fontSize = 57.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.DarkGray,
            modifier = modifier
                .padding(top =10.dp, bottom = 15.dp)
                .align(Alignment.CenterHorizontally)
        )
        Image(
            painter = painterResource(id = when (currentImageId) {
                1 -> image1
                2 -> image2
                3 -> image3
                4 -> image4
                5 -> image5
                6 -> image6
                7 -> image7
                8 -> image8
                9 -> image9
                else -> image10}),
            contentDescription = "Artwork image",
            modifier = Modifier
                .fillMaxWidth()
                .size(280.dp)
        )
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(10.dp)
                .background(Color.Transparent)
        )
        Text(
            text = when(currentTextId){
                1 -> text1
                2 -> text2
                3 -> text3
                4 -> text4
                5 -> text5
                6 -> text6
                7 -> text7
                8 -> text8
                9 -> text9
                else -> text10},
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = modifier
                .padding(10.dp)
        )
        Text(
            text = when(currentInfoID){
                1 -> authorAndYear1
                2 -> authorAndYear2
                3 -> authorAndYear3
                4-> authorAndYear4
                5 -> authorAndYear5
                6 -> authorAndYear6
                7 -> authorAndYear7
                8 -> authorAndYear8
                9 -> authorAndYear9
                else -> authorAndYear10
                 },
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = modifier
                .padding(10.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(
            modifier = modifier
                .fillMaxWidth()
                .height(25.dp)
                .background(Color.Transparent)
        )

        Row(modifier = modifier
            .align(Alignment.CenterHorizontally))
        {
            Button(onClick ={
                currentImageId -= 1
                currentTextId -= 1
                currentInfoID -= 1
            },
                modifier = modifier
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                Text(
                    text = "   <<<   ",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Button(onClick ={
                currentImageId += 1
                currentTextId += 1
                currentInfoID += 1
            },
                modifier = modifier
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                Text(
                    text = "   >>>   ",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio6Theme {
        Gallery()
    }
}