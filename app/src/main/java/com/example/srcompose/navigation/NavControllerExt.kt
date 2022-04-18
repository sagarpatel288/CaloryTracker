package com.example.srcompose.navigation

import androidx.navigation.NavController
import com.example.core.utils.UiEvent

fun NavController.navigate(uiEvent: UiEvent.Navigate) {
    this.navigate(uiEvent.route)
}