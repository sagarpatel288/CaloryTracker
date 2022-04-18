package com.example.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import com.example.core_ui.LocalSpacing

@Composable
fun ActionButton(
    textOnButton: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.button,
    color: Color = MaterialTheme.colors.onPrimary,
    shape: Shape = RoundedCornerShape(LocalSpacing.current.spaceExtraLarge),
    textModifier: Modifier = Modifier.padding(LocalSpacing.current.spaceSmall),
    isEnabled: Boolean = true
) {
    Button(
        onClick = onClick,
        enabled = isEnabled,
        modifier = modifier,
        shape = shape
    ) {
        Text(
            text = textOnButton,
            color = color,
            modifier = textModifier,
            style = textStyle
        )
    }
}


