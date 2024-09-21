package com.example.pos_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pos_android.ui.theme.POS_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            POS_AndroidTheme {
                MainScreen(gridList)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(gridListPara: Array<String>) {
    Box(Modifier.fillMaxSize()){
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("Small Top App Bar")
                    }
                )
            },
        ) {
                innerPadding ->
            Box(Modifier.padding(innerPadding)){
                LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 50.dp)) {
                    items(gridListPara) { listItem ->
                        Box(Modifier.width(30.dp)) {
                            Text("list $listItem")
                        }
                    }
                }
            }
        }
    }
}
val gridList: Array<String> = arrayOf("ab","ab","ab","ab","ab");