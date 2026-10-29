package com.molook.challenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Gold = Color(0xFFD4AF37)
private val Black = Color(0xFF0B0B0D)
private val Gray = Color(0xFF9A9A9A)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                Splash()
            }
        }
    }
}

@Composable
private fun Splash() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "ملوك التحدّي",
            color = Gold,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "إصدار اللمة",
            color = Gray,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "نسخة أولية: الهيكل يعمل، واللعبة قيد البناء",
            color = Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 32.dp)
        )
    }
}
