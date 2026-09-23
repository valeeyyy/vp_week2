package com.valerie.vp_week2.Soal2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.valerie.vp_week2.Soal2.myTravelView
import com.valerie.vp_week2.ui.theme.Vp_week2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            myTravelView()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Vp_week2Theme {
        myTravelView()
    }
}