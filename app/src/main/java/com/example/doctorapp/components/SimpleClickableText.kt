package com.example.doctorapp.components

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.AnnotatedString

@Composable
fun SimpleClickableText(
    text: String,
    onClick: () -> Unit
) {
    ClickableText(
        text = AnnotatedString(text),
        onClick = {
            onClick()
        }
    )
}