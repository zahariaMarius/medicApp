package com.example.doctorapp.presentation.home

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import com.example.doctorapp.components.SimpleVisitCard

@Composable
fun HomeScreen(
    viewModel: HomeScreenViewModel = hiltViewModel()
) {

    val visits = viewModel.visitPager.collectAsLazyPagingItems()

    Column(modifier = Modifier.fillMaxWidth()) {

        /*Row() {
            SimpleLottieFiles(
                urlLottieFiles = "https://assets7.lottiefiles.com/private_files/lf30_4FGi6N.json"
            )
        }*/

        Row() {
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
    }

}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}