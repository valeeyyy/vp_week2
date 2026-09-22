package com.valerie.vp_week2

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.SkipNext
import androidx.compose.material.icons.filled.SkipPrevious
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun displayMusicView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFA8D0E3))
            .padding(16.dp)

    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Liked Songs",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center

        )

        Spacer(modifier = Modifier.height(50.dp))

        Image(
            painter = painterResource(id = R.drawable.lany_cover),
            contentDescription = "Lany Cover",
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .clip(RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Last Forever",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Lany",
                    fontSize = 22.sp
                )
            }
            Icon(imageVector = Icons.Default.Favorite, contentDescription = "Like")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Divider(color = Color.Black, thickness = 4.dp)

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "0:12", fontSize = 12.sp)
            Text(text = "-2:14", fontSize = 12.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.SkipPrevious, contentDescription = "Previous")

            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Pause,
                    contentDescription = "Pause",
                    tint = Color.White
                )
            }

            Icon(imageVector = Icons.Default.SkipNext, contentDescription = "Next")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFF5F8FA6))
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = "Lyrics", color = Color.White, fontSize = 22.sp)
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "When I first saw your face\n" +
                        "It took my breath away\n" +
                        "Tried, but I couldn't find the words to say\n" +
                        "The one thing on my mind\n" +
                        "Was the rest of my life\n" +
                        "Felt it when I looked in your eyes that night\n\n" +
                        "You would be my last forever\n" +
                        "I want this to last forever\n" +
                        "I would die if one day we couldn't be together\n" +
                        "I'm begging, baby, please\n" +
                        "For you to promise me you would be my last forever\n\n" +
                        "Flowers bloom, then they die\n" +
                        "\"Hellos\" end in \"goodbyes\"\n" +
                        "You nevеr get the same colors in thе sky\n" +
                        "Some love just passin' through\n" +
                        "Some love one night or two\n" +
                        "But some loves you just know when you do, and I knew\n\n" +
                        "You would be my last forever\n" +
                        "I want this to last forever\n" +
                        "I would die if one day we couldn't be together\n" +
                        "I'm begging, baby, please\n" +
                        "For you to promise me",
                color = Color.White,
                fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun displayMusicPreview() {
    displayMusicView()
}
