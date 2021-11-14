package com.lookenghua.vantforandroid.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CustomAppBar(navController: NavController) {
    TopAppBar(backgroundColor = Color(0xFFFFFFFF),) {
        Box(modifier = Modifier.fillMaxWidth().background(brush = Brush),) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowLeft,
                contentDescription = null,
                Modifier.clickable {
                    navController.popBackStack()
                }
            )
            Text(text = "Button 按钮", Modifier.align(Alignment.Center))
        }

    }
}