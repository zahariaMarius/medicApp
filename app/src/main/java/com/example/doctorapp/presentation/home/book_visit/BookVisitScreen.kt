package com.example.doctorapp.presentation.home.book_visit

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DatePicker
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookVisitScreen() {

    Text(text = "Book Visit Screen")

    val datePickerState = rememberDatePickerState(initialDisplayedMonthMillis = null)

    Column(
    ) {
        DatePicker(
            state = datePickerState,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "${datePickerState.selectedDateMillis}? : niente"
        )

    }


}