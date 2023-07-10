package com.example.doctorapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieConstants
import com.example.doctorapp.presentation.signup.SignUpScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleSignUpAlertDialog(
    viewModel: SignUpScreenViewModel,
    onSignUpSuccess: () -> Unit
) {
    AlertDialog(
        onDismissRequest = {}
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            shape = MaterialTheme.shapes.large,
            tonalElevation = AlertDialogDefaults.TonalElevation
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier.size(100.dp, 100.dp)
                    ) {
                        SimpleLottieFiles(
                            urlLottieFiles = "https://assets10.lottiefiles.com/packages/lf20_atippmse.json",
                            iterations = 1
                        )
                    }
                    Text(
                        text = "Thank you!",
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Text(
                        text = "Your account has been successfully registered.",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                }
                TextButton(
                    onClick = {
                        viewModel.openDialog = false
                        onSignUpSuccess()
                    },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("Go to sign in")
                }
            }
        }
    }
}