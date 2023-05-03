package com.stanroy.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stanroy.playground.common.Screen
import com.stanroy.playground.module_poke_swipe.presentation.screen_main.PokeSwipeMainScreen
import com.stanroy.playground.ui.theme.PlaygroundTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        lifecycleScope.launch {
            // fix for issue with xiaomi phones not showing the compose layout correctly -> https://issuetracker.google.com/issues/227926002
            delay(50)
            window.setBackgroundDrawableResource(android.R.color.transparent)
        }

        val menuItems = mutableListOf<MainMenuItem>(
            MainMenuItem(
                getMainMenuTitle(R.string.main_menu_poke_swipe),
                Screen.PokeSwipeMainScreen.route
            )
        )
        setContent {
            PlaygroundTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.PokeSwipeMainScreen.route
                    ) {
                        composable(Screen.MainMenu.route) {
                            MainMenu(navController, menuItems)
                        }

                        composable(Screen.PokeSwipeMainScreen.route) {
                            PokeSwipeMainScreen()
                        }
                    }
                }
            }
        }
    }
}

private fun MainActivity.getMainMenuTitle(id: Int) =
    this.applicationContext.getString(id)
