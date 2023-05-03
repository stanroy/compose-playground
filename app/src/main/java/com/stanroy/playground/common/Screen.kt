package com.stanroy.playground.common

sealed class Screen(val route: String) {
    object MainMenu : Screen("MainMenu")

    // Poke Swipe
    object PokeSwipeMainScreen : Screen("PokeSwipe.MainScreen")
}