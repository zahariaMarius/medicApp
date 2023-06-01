package com.example.doctorapp.components

import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SimpleNavigationDrawerItem(
    label: String,
    selected: Boolean,
    onClick: () -> Unit
) {

    NavigationDrawerItem(
        label = {
            Text(text = label)
        },
        selected = selected,
        onClick = {
            onClick()
        }
    )

}