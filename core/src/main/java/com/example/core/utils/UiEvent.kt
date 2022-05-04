package com.example.core.utils

/**
 * 04/05/22 10:03
 * <p>
 * We use [UiEvent] to populate single time UI events from
 * ViewModel to composable.
 * </p>
 * We have made this [UiEvent] as a part of the Core module
 * because each module can propagate single time UI event
 * such as a navigation.
 * </p>
 * To perform a navigation, we need this [UiEvent] sealed class as a data
 * and [com.example.core.navigation.Route] object class as a value.
 * </p>
 * @author sagar patel
 * @since v1.0.0.
 */
sealed class UiEvent {
    data class Navigate(val route: String) : UiEvent()
    object NavigateUp : UiEvent()
}



