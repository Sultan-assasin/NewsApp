package com.sultan.newsapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.navigation.compose.rememberNavController
import com.sultan.newsapp.ui.theme.NewsAppTheme
import com.sultan.newsapp.util.NavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppTheme {
                val navGraph = rememberNavController()
                NavGraph(navController = navGraph)

            }
        }
    }
}


// 1512bc8de08c4016b7b1b9544723a888
