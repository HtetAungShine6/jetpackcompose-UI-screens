package com.uistack.jetpackcompose4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.uistack.jetpackcompose4.ui.screens.LoginScreen
import com.uistack.jetpackcompose4.ui.theme.PrimaryColor
import com.uistack.jetpackcompose4.ui.theme.JetpackCompose4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose4Theme {
                Surface(color = PrimaryColor, modifier = Modifier.fillMaxSize()) {
LoginScreen()
                }
            }
        }
    }
}
