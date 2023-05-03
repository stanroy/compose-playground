package com.stanroy.playground.common

sealed class Screen(val route: String) {
    object MainMenu : Screen("MainMenu")

    // Tinder Clone
    object TinderCloneMainScreen : Screen("TinderClone.MainScreen")
}