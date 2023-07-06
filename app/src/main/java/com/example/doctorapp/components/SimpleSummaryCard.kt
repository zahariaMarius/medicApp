package com.example.doctorapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun SimpleSummaryCard(
    imageVector: ImageVector,
    headLine: String,
    supportingText: String,
    onEditClick: (() -> Unit)?
) {
    ElevatedCard(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Icon(imageVector = imageVector, contentDescription = "")
            }
            Column() {
                Text(text = headLine)
                Text(text = supportingText)
            }
            if (onEditClick != null) {
                IconButton(onClick = {
                    onEditClick()
                }) {
                    Icon(Icons.Outlined.Edit, contentDescription = "Edit")
                }
            }
        }

    }
}