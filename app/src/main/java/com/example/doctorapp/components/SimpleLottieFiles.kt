package com.example.doctorapp.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition


@Composable
fun SimpleLottieFiles(
    urlLottieFiles: String,
    iterations: Int
){
    val composition by rememberLottieComposition(spec = LottieCompositionSpec.Url(urlLottieFiles))
    LottieAnimation(composition = composition, iterations = iterations)
}