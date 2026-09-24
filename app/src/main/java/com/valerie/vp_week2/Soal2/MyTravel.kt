package com.valerie.vp_week2.Soal2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.valerie.vp_week2.R

val PoppinsFont = FontFamily(
    Font(R.font.poppinsregular, FontWeight.Normal),
    Font(R.font.poppinsbold, FontWeight.Bold),
    Font(R.font.poppinsmedium, FontWeight.Medium)
)

@Composable
fun myTravelView() {
    Box(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.aurora),
            contentDescription = "Aurora",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.67f)
                .clip(
                    RoundedCornerShape(
                        topStart = 40.dp,
                        topEnd = 40.dp,
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
                .background(Color(0xFF2E2E48))
                .padding(25.dp)
        ) {
            Text(
                text = "My Travel",
                color = Color.White,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = PoppinsFont,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(22.dp))

            Text(
                text = "Aurora",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = PoppinsFont
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Tromsø, Norway",
                color = Color.White,
                fontSize = 20.sp,
                fontFamily = PoppinsFont
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically

            ) {
                repeat(5) {
                    Icon (
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color(0xFFFFCF58),
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(25.dp))

                Text(
                    text = "5.0",
                    color = Color(0xFFFFCF58),
                    fontFamily = PoppinsFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 28.sp,
                )
            }

            Spacer(modifier = Modifier.height(25.dp))

            var q1 by remember { mutableStateOf("") }
            TextField(
                value = q1,
                onValueChange = { q1 = it },
                modifier = Modifier
                    .width(330.dp),
                placeholder = {
                    Text(
                        "What did you enjoy most about your trip?",
                        fontSize = 13.sp
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFC9E1F5),
                    unfocusedContainerColor = Color(0xFFC9E1F5)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            var q2 by remember { mutableStateOf("") }
            TextField(
                value = q2,
                onValueChange = { q2 = it },
                modifier = Modifier
                    .width(330.dp),
                placeholder = {
                    Text(
                        "What was your favorite spot?",
                        fontSize = 13.sp
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFC9E1F5),
                    unfocusedContainerColor = Color(0xFFC9E1F5)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            var q3  by remember { mutableStateOf("") }
            TextField(
                value = q3,
                onValueChange = { q3 = it },
                modifier = Modifier
                    .width(330.dp),
                placeholder = {
                    Text(
                        "Anything else you'd like to add?",
                        fontSize = 13.sp
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFC9E1F5),
                    unfocusedContainerColor = Color(0xFFC9E1F5)
                )
            )
        }

        FloatingActionButton(
            onClick = {},
            containerColor = Color(0xFFD8ECFB),
            contentColor = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(24.dp)
        ) {
            Text(
                text = "+",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun myTravelPreview() {
    myTravelView()
}