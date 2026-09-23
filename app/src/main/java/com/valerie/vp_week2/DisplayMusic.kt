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
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
            .padding(horizontal = 35.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "Back",
                modifier = Modifier.size(35.dp)
            )
            Text(
                text = "Liked Songs",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Icon(
                imageVector = Icons.Default.MoreHoriz,
                contentDescription = "More options",
                modifier = Modifier.size(35.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.lany_cover),
            contentDescription = "Lany Cover",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(330.dp)
                .clip(RoundedCornerShape(8.dp))
        )

        Spacer(modifier = Modifier.height(30.dp))

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

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Lany",
                    fontSize = 22.sp
                )
            }
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Like",
                modifier = Modifier.size(35.dp)
            )
        }

        Spacer(modifier = Modifier.height(22.dp))

        Divider(
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black,
            thickness = 5.dp
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "0:12", fontSize = 16.sp)
            Text(text = "-2:14", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.SkipPrevious,
                contentDescription = "Previous",
                modifier = Modifier.size(52.dp)
            )

            Box(
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(50))
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Pause,
                    contentDescription = "Pause",
                    tint = Color.White,
                    modifier = Modifier.size(35.dp)
                )
            }

            Icon(
                imageVector = Icons.Default.SkipNext,
                contentDescription = "Next",
                modifier = Modifier.size(52.dp)
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(Color(0xFF5F8FA6))
                .padding(28.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(text = "Lyrics", color = Color.White, fontSize = 25.sp)
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
                        "You never get the same colors in the sky\n" +
                        "Some love just passin' through\n" +
                        "Some love one night or two\n" +
                        "But some loves you just know when you do, and I knew\n\n" +
                        "You would be my last forever\n" +
                        "I want this to last forever\n" +
                        "I would die if one day we couldn't be together\n" +
                        "I'm begging, baby, please\n" +
                        "For you to promise me",
                color = Color.White,
                fontSize = 20.sp,
                lineHeight = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun displayMusicPreview() {
    displayMusicView()
}