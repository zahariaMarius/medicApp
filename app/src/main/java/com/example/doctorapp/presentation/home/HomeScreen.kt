package com.example.doctorapp.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import com.airbnb.lottie.compose.LottieConstants
import com.example.doctorapp.components.SimpleLottieFiles
import com.example.doctorapp.components.SimpleVisitCard

@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel = hiltViewModel()
) {

    val visits = viewModel.visitPager.collectAsLazyPagingItems()

    Column(
        modifier = Modifier
    ) {
        when (val state = visits.loadState.refresh) {
            LoadState.Loading -> {
                Column(
                    modifier = Modifier.fillMaxHeight().fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularProgressIndicator()
                }
            }

            is LoadState.Error -> {
                Log.d("HOMESCREEN", "sono in error ${state.error}")
            }

            else -> {
                if (visits.itemCount != 0) {
                    Column(
                        modifier = Modifier,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        LazyColumn(
                            modifier = Modifier
                        ) {
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
                } else {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        SimpleLottieFiles(
                            urlLottieFiles = "https://assets9.lottiefiles.com/packages/lf20_qpLa3wzbPB.json",
                            iterations = LottieConstants.IterateForever
                        )
                    }
                }
            }
        }
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}