package com.ddas.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import com.ddas.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}



@Composable

fun Greeting(modifier: Modifier = Modifier) {
    var showPopup by remember {mutableStateOf(false)}

    Surface (color = Color.DarkGray,
        modifier = modifier
            .fillMaxSize()){


Column(verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = modifier
        .padding(24.dp)) {


    Text(
        text = "Enter Your Name",
        color = Color.White,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        fontSize = 38.sp,
        )


//    var text by remember { mutableStateOf("") }
//    OutlinedTextField(
//        value = text,
//        onValueChange = { text = it },
//        label = {
//            Text(
//                "Enter Your Name",
//                color = Color.White
//            )
//        },
//        modifier = modifier
//            .padding(top = 240.dp, start = 24.dp, end = 24.dp, bottom = 550.dp)
//
//    )
//
//    Button(modifier = modifier
//        .padding(top = 350.dp, start = 20.dp, end = 20.dp, bottom = 450.dp),
//        shape = RectangleShape, onClick = { showPopup = true }) {
//        Text(text = "Enter")
//    }
}
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting()
        
    }
}