package com.example.doctorapp.presentation.home

import android.util.Log
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleRight
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.Computer
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material.icons.filled.Link
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Pin
import androidx.compose.material.icons.filled.PinDrop
import androidx.compose.material.icons.filled.Web
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import com.example.doctorapp.components.SimpleTherapyCard
import com.example.doctorapp.components.SimpleVisitCard
import com.example.doctorapp.navigation.screen.HomeScreen

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {

    val therapiesScrollState = rememberScrollState()

    //val visits = viewModel.visitPager.collectAsLazyPagingItems()


    /*Column() {

        Column() {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Upcoming visits")
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = {}) {
                        Text(text = "View all")
                    }
                    Icon(
                        imageVector = Icons.Filled.ArrowRight,
                        contentDescription = "View all visits"
                    )
                }
            }

            when (val state = visits.loadState.refresh) {
                LoadState.Loading -> {
                    Log.d("HOMESCREEN", "sono in loading")
                    //TODO implement loading state
                }

                is LoadState.Error -> {
                    Log.d("HOMESCREEN", "sono in error ${state.error}")
                    //TODO implement error state
                }

                else -> {
                    Log.d("HOMESCREEN", "sono in column")
                    LazyColumn(modifier = Modifier) {
                        items(
                            count = visits.itemCount,
                            key = visits.itemKey(),
                            contentType = visits.itemContentType()
                        ) { index ->
                            val visit = visits[index]
                            visit?.let {
                                SimpleVisitCard(visit = visit)
                            }
                        }
                    }
                }
            }

        }

        Column() {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Current therapies")
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = {}) {
                        Text(text = "View all")
                    }
                    Icon(
                        imageVector = Icons.Filled.ArrowRight,
                        contentDescription = "View all therapies"
                    )
                }

            }
            Row(
                modifier = Modifier
                    .verticalScroll(therapiesScrollState)
                    .fillMaxWidth()
            ) {
                SimpleTherapyCard()
            }
        }
    }

     */


}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}