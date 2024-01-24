package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintSet
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                FilledBtnComposeable {}
                FilledTonalBtn {}
                OutlinBtn {}
                ElevatedBtn {}
                TextBtn {}
            }

        }
    }
}


@Composable
fun FilledBtnComposeable(onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text(text = "Filled")
    }
}

@Composable
fun FilledTonalBtn(onClick: () -> Unit) {
    FilledTonalButton(onClick = { onClick() }) {
        Text(text = "Tonal")
    }
}

@Composable
fun OutlinBtn(onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }) {
        Text(text = "Outlined")
    }
}

@Composable
fun ElevatedBtn(onClick: () -> Unit) {
    ElevatedButton(onClick = { onClick() }) {
        Text(text = "Outlined")
    }
}


@Composable
fun TextBtn(onClick: () -> Unit) {
    TextButton(onClick = { onClick() }) {
        Text(text = "Text-btn")
    }
}