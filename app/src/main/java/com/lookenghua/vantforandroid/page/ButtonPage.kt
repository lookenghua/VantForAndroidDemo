package com.lookenghua.vantforandroid.page

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lookenghua.vantforandroid.components.CustomAppBar


@Composable
fun ButtonPage(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { CustomAppBar(navController) }
    ) {

    }
}

@Preview(showBackground = true, widthDp = 360)
@Composable
fun DefaultButtonPreviewPage() {
    val navController = rememberNavController()
    ButtonPage(navController)
}