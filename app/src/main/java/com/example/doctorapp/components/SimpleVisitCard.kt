package com.example.doctorapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.Computer
import androidx.compose.material.icons.filled.PinDrop
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.doctorapp.domain.model.Visit

@Composable
fun SimpleVisitCard(
    visit: Visit
) {

    ElevatedCard(
        modifier = Modifier.padding(16.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = visit.dateTime.toString())
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Filled.Circle,
                    contentDescription = "",
                    tint = if (visit.online) Color.Green else Color.Red
                )
                Text(text = if (visit.online) "Online" else "Offline")
            }
        }
        Divider()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column() {
                Text(text = "Dr. ${visit.doctorFullName()}")
                Text(text = "Visita di consulto")
                Text(text = "Sede via pessinetto 12")
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (visit.online) {
                    Icon(
                        imageVector = Icons.Filled.Computer,
                        contentDescription = "Go to visit page"
                    )
                    Text(text = "Go to visit")
                } else {
                    Icon(
                        imageVector = Icons.Filled.PinDrop,
                        contentDescription = "Show on map"
                    )
                    Text(text = "View map")
                }
            }
        }

    }

}