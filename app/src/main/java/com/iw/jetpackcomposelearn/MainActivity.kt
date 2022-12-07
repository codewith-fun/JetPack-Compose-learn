package com.iw.jetpackcomposelearn

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iw.jetpackcomposelearn.data.Message
import com.iw.jetpackcomposelearn.ui.theme.JetPackComposeLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          ComposableCard(Message("Blogs","Blogs are generally a set of particularly topic information!"))
        }
    }
}
@Preview
@Composable
fun ComposableCard(m :Message?){
    Column() {
        Text(text = "${m?.msg}",
            color = Color.Black,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "${m?.description}")
    }

}