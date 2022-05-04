package com.example.core.utils

/**
 * 04/05/22 10:03
 * We use [UiEvent] to populate single time UI events from
 * ViewModel to composable.
 * @author sagar patel
 * @since v1.0.0.
 */
sealed class UiEvent {
    data class Navigate(val route: String) : UiEvent()
    object NavigateUp : UiEvent()
}



