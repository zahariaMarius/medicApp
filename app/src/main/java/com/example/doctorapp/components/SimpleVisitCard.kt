package com.example.doctorapp.components

import com.example.doctorapp.ui.theme.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MeetingRoom
import androidx.compose.material.icons.filled.PinDrop
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.doctorapp.domain.model.Visit

@Composable
fun SimpleVisitCard(
    visit: Visit
) {

    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            color1,
                            color2
                        )
                    )
                )
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Column(
                modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(text = "Dr.", fontWeight = FontWeight.Bold)
                    Text(text = visit.doctorFullName())
                }
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(text = "Date:", fontWeight = FontWeight.Bold)
                    Text(text = visit.formattedDate())
                }
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(text = "Status:", fontWeight = FontWeight.Bold)
                    Text(text = visit.status.toString().lowercase())
                }
                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(text = "Online:", fontWeight = FontWeight.Bold)
                    Text(text = visit.online.toString())
                }
            }

        }

    }

}