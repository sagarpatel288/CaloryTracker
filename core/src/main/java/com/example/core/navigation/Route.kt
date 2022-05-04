package com.example.core.navigation

import com.example.core.utils.UiEvent

/**
 * 04/05/22 10:18
 * <p>
 * A navigation controller requires a route as in form of a String
 * to perform a navigation using the Composable.
 * </p>
 * We have made this [Route] as a part of the Core module because
 * each module can perform a navigation.
 * </p>
 * To perform a navigation, we need [UiEvent] sealed class as a data
 * and this [Route] object class as a value.
 * </p>
 * @author sagar patel
 * @since v0.0.1.
 */
object Route {
    const val WELCOME = "welcome"
    const val AGE = "age"
    const val GENDER = "gender"
    const val HEIGHT = "height"
    const val WEIGHT = "weight"
    const val NUTRIENT_GOAL = "nutrient_goal"
    const val ACTIVITIES = "activities"
    const val GOAL = "goal"
    const val SEARCH = "search"
    const val TRACKER_OVERVIEW = "tracker_overview"
}