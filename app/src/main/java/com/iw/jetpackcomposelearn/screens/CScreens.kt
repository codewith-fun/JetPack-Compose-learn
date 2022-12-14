package com.iw.jetpackcomposelearn.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iw.jetpackcomposelearn.data.Message

/**
 * initial card
 */
@Preview(showBackground = true)
@Composable
fun ReplyAppPreview(m: Message, windowSize: WindowSizeClass){
        ReleyApp( m, windowSize)
}

@Preview(showBackground = true, widthDp = 700)
@Composable
fun ReplyAppPreviewTablet(m: Message, windowSize: WindowSizeClass){
    ReleyApp(m, windowSize)
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
fun ReplyAppPreviewDesktop(m: Message, windowSize: WindowSizeClass){
    ReleyApp(m,  windowSize)
}
// release check
/**
 * git tag v0.1 -a -m "Release v0.1"
   git push --follow-tags
 */
@Composable
fun ReleyApp(m:Message,windowSize: WindowSizeClass){
    Card(elevation = 5.dp,
        modifier = Modifier
            .padding(5.dp),
    ) {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(painter = painterResource(id = m.ic_image),
                contentDescription ="Content",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .align(CenterVertically)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Column(modifier = Modifier.padding(10.dp,0.dp,0.dp,0.dp)) {
                Text(
                    text = "${m?.msg}",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "${m?.description}")
            }
        }
    }
}

/**
 * initial recyclerview card
 */

@Composable
fun MyRecyclerView(message: List<Message>, windowSize: WindowSizeClass){
    LazyColumn{
        items(message){
            ReleyApp(it,windowSize)
        }
    }
}