package com.example.doctorapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doctorapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleCard(
    item: Unit?
) {
    Card(
        onClick = { /* Do something */ },
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier) {
            Text(text = "Nome Cognome")
            Text(text = "ASLTO 2")
        }

    }
}

@Preview
@Composable
fun CardPreview() {
    SimpleCard(item = null)
}