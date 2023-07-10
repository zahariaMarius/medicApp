package com.example.doctorapp.presentation.onboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.doctorapp.components.SimpleOnboardBottomSection
import com.example.doctorapp.components.SimplePagerIndicator
import com.example.doctorapp.session.SessionManager
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardScreen(
    rootNavHostController: NavHostController,
    sessionManager: SessionManager
) {
    val items = ArrayList<OnBoardingData>()

    items.add(
        OnBoardingData(
            url = "https://assets9.lottiefiles.com/packages/lf20_otmfyizb.json",
            "Health in your hands",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        )
    )

    items.add(
        OnBoardingData(
            url = "https://assets2.lottiefiles.com/temp/lf20_qCBn5k.json",
            "Schedule a medical check-up",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        )
    )

    items.add(
        OnBoardingData(
            url = "https://assets5.lottiefiles.com/packages/lf20_kvwtrk4n.json",
            "Stay healthy",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(
        item = items,
        pagerState = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White),
        rootNavHostController = rootNavHostController,
        sessionManager = sessionManager
    )
}

@ExperimentalPagerApi
@Composable
fun OnBoardingPager(
    item: List<OnBoardingData>,
    pagerState: PagerState,
    rootNavHostController: NavHostController,
    sessionManager: SessionManager,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxHeight()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(
                state = pagerState
            ) { page ->
                Column(
                    modifier = Modifier
                        .padding(60.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    LoaderIntro(
                        modifier = Modifier
                            .size(200.dp)
                            .fillMaxWidth()
                            .align(alignment = Alignment.CenterHorizontally), item[page].url
                    )
                    Text(
                        text = item[page].title,
                        modifier = Modifier.padding(top = 50.dp),
                        color = Color.Black,
                        style = MaterialTheme.typography.headlineMedium,
                        textAlign = TextAlign.Center
                    )

                    Text(
                        text = item[page].desc,
                        modifier = Modifier.padding(top = 30.dp, start = 20.dp, end = 20.dp),
                        color = Color.Black,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center
                    )
                }
            }
            SimplePagerIndicator(item.size, pagerState.currentPage)
        }
        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            SimpleOnboardBottomSection(
                pagerState = pagerState,
                rootNavHostController = rootNavHostController,
                sessionManager = sessionManager
            )
        }
    }
}

@ExperimentalPagerApi
@Composable
fun rememberPagerState(
    pageCount: Int,
    initialPage: Int = 0,
    initialPageOffset: Float = 0f,
    initialOffscreenLimit: Int = 1,
    infiniteLoop: Boolean = false
): PagerState = rememberSaveable(
    saver = PagerState.Saver
) {
    PagerState(
        pageCount = pageCount,
        currentPage = initialPage,
        currentPageOffset = initialPageOffset,
        offscreenLimit = initialOffscreenLimit,
        infiniteLoop = infiniteLoop
    )
}