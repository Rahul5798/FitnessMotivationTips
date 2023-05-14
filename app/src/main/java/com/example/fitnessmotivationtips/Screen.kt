package com.example.fitnessmotivationtips

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fitnessmotivationtips.model.DailyTip

@Composable
fun DailyTipCard(dailyTip: DailyTip, modifier: Modifier = Modifier){
    Card(modifier = modifier
        .clip(MaterialTheme.shapes.medium)
        .padding(8.dp, 16.dp)
    ){
        Column(modifier = modifier.padding(16.dp)) {
            Text(
                text = stringResource(id = dailyTip.day),
                style = MaterialTheme.typography.titleLarge,
                modifier = modifier.padding(0.dp,8.dp)
            )
            Image(
                painter = painterResource(id = dailyTip.image),
                contentDescription = "tip1",
                modifier = modifier
                    .clip(MaterialTheme.shapes.medium),
            )
            Text(
                text = stringResource(id = dailyTip.tip),
                style = MaterialTheme.typography.labelLarge,
                modifier = modifier.padding(0.dp,8.dp)
            )
        }
    }
}

@Composable
@Preview
fun Preview(){
    DailyTipCard(dailyTip = DailyTip(
        day = R.string.day1,
        image = R.drawable.pexels_victor_freitas_2261477,
        tip = R.string.tip1
    ))
}