package com.stanroy.playground

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.stanroy.playground.ui.common.defaultWindowPadding

@Composable
fun MainMenu(navController: NavController, menuItems: List<MainMenuItem>) {
    Column(
        modifier = Modifier.fillMaxSize().defaultWindowPadding,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(id = R.string.main_menu_title), fontSize = 45.sp)
        Spacer(modifier = Modifier.height(48.dp))
        LazyColumn() {
            items(items = menuItems) {
                Button(onClick = {
                    // TODO: start working on tinder clone
                    // won't navigate anywhere right now
                    navController.navigate(it.route)
                }) {
                    Text(text = it.title)
                }
            }
        }
    }
}

data class MainMenuItem(val title: String, val route: String)

