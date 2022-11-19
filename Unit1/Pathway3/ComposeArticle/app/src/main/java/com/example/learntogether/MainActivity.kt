package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainImage()
                }
            }
        }
    }
}

@Composable
fun TutorialText() {
    Column {
        Text(
            text = stringResource(R.string.title),
            modifier = Modifier
                .padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(R.string.introduction),
            modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.description),
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun MainImage() {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(120.dp),
            contentScale = ContentScale.Crop
        )
        TutorialText()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherTheme {
        MainImage()
    }
}