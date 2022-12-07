package com.iw.jetpackcomposelearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.iw.jetpackcomposelearn.repository.MyRepository
import com.iw.jetpackcomposelearn.screens.MyRecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myUi()
        }
    }

}

@Preview(showBackground = true)
@Composable
fun myUi(){
    val  msg = remember{
        MyRepository().getAllMessage()
    }
    val myrepo = MyRepository()
    val repoMsg = myrepo.getAllMessage()
    MyRecyclerView(message = msg)
}

