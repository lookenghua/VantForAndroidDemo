package com.lookenghua.vantforandroid.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lookenghua.vantforandroid.R
import com.lookenghua.vantforandroid.conf.menus

@Composable
fun HomePage(navController: NavController) {
    val list = menus
    Column(
        Modifier
            .padding(start = 20.dp, top = 46.dp, end = 20.dp)
            .verticalScroll(
                rememberScrollState()
            )
    ) {
        Row(Modifier.padding(bottom = 16.dp)) {
            Image(
                painter = painterResource(R.mipmap.logo),
                contentDescription = "12",
                Modifier.size(32.dp)
            )
            Text(text = "Vant", fontSize = 24.sp, modifier = Modifier.padding(horizontal = 16.dp))
        }
        Text(
            text = "轻量、可靠的移动端组件库",
            fontSize = (14 * 0.75).sp,
            modifier = Modifier.padding(bottom = 40.dp)
        )
        list.forEach { item ->
            Text(
                item.title, fontSize = (14 * 0.75).sp,
                modifier = Modifier.padding(start = 24.dp, end = 8.dp, bottom = 16.dp)
            )
            item.children.forEach { menu ->
                Button(
                    onClick = {
                        navController.navigate(menu.route)
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF7F8FA)),
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(50),
                    elevation = ButtonDefaults.elevation(
                        defaultElevation = 0.dp,
                        pressedElevation = 0.dp
                    ),
                ) {
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = menu.title,
                            color = Color(0xFF323233),
                            fontWeight = FontWeight.W600,
                            textAlign = TextAlign.Left,
                        )
                        Icon(
                            imageVector = Icons.Outlined.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }
                Spacer(Modifier.height(12.dp))
            }
        }
    }
}