package com.example.examenlucian

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examenlucian.ui.theme.ExamenLucianTheme
import com.example.examenlucian.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenLucianTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize().width(600.dp).padding(0.dp,50.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.width(350.dp).height(300.dp).background(Color.Gray).padding(0.dp,50.dp,0.dp,50.dp)) {
            Row(modifier = Modifier.height(100.dp).fillMaxWidth()) {
                Column {

                }
                Column {

                }
                Column {
                    Text(
                        text = "Hello $name!",
                        modifier = modifier.background(Color.Red)
                    )
                }


            }
            Row(modifier = Modifier.height(100.dp).fillMaxWidth()) {
                Column {

                }
                Column {

                }
                Column {
                    Text(
                        text = "Hello $name!",
                        modifier.background(Color.Red)
                    )
                }

            }
            Row (modifier = Modifier.height(100.dp).fillMaxWidth()){
                Column {
                    Text(
                        text = "Hello $name!",
                        modifier.background(Color.Red)
                    )
                }
                Column {

                }
                Column {
                    Text(
                        text = "Hello $name!",
                        modifier.background(Color.Red).width(70.dp).height(70.dp)
                    )
                }

            }

        }
        Row {
            Text(
                text = "Hello $name!",
                modifier.background(Color.White).width(200.dp).height(200.dp).padding(0.dp)

            )
        }
        Row(modifier.background(Color.Green).width(250.dp).height(200.dp).padding(0.dp)) {

        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ExamenLucianTheme {
        Greeting("Android")
    }
}
