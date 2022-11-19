package com.example.namecard

import android.graphics.Color.BLUE
import android.os.Bundle
import android.util.Size
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.namecard.ui.theme.NamecardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NamecardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    fullpage()
                }
            }
        }
    }
}

@Composable
fun Introduce() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val image = painterResource(R.drawable.rabbit)
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = """Hyosun
                |Kim""".trimMargin(),
            textAlign = TextAlign.Center, //글자들을 중앙에 배치
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
        )
    }
}

@Composable
fun Information() {
    Column(
        Modifier.padding(top = 90.dp)
    ) {
        ExtraInformation(
            stringResource(R.string.num_title),
            stringResource(R.string.my_phone)
        )
        ExtraInformation(
            stringResource(R.string.address_title),
            stringResource(R.string.my_location)
        )
        ExtraInformation(
            stringResource(R.string.github_title),
            stringResource(R.string.my_github),
        )
        ExtraInformation(
            stringResource(R.string.dream_title),
            stringResource(R.string.my_dream)
        )
    }
}

@Composable
fun ExtraInformation(
    title: String,
    MyInfor: String,
    modifier: Modifier = Modifier
) {
    Row(
        Modifier.padding(bottom = 16.dp),
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            color = Color.Magenta,
            modifier = Modifier.padding(end = 40.dp)
        )
        Text(
            text = MyInfor,
            textAlign = TextAlign.Justify,
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Composable
fun fullpage() {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Introduce()
        Information()
        Text(
            text = "Happy to Meet you",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            color = Color.Red,
            modifier = Modifier.padding(top = 40.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NamecardTheme {
        fullpage()
    }
}