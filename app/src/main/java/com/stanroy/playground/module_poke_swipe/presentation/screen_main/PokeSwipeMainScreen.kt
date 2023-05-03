package com.stanroy.playground.module_poke_swipe.presentation.screen_main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.stanroy.playground.R
import com.stanroy.playground.ui.common.defaultVerticalPadding

@Composable
fun PokeSwipeMainScreen() {
    Column(
        modifier = Modifier.fillMaxSize().defaultVerticalPadding,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Top row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // TODO: change icons later
            // temp dex icon & logo
            Row {
                Image(
                    modifier = Modifier.size(32.dp),
                    painter = painterResource(id = R.drawable.location),
                    contentDescription = stringResource(id = R.string.poke_swipe_cd_favorites)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(id = R.string.poke_swipe_title),
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
            }
            Image(
                modifier = Modifier.size(32.dp),
                painter = painterResource(id = R.drawable.bookmark),
                contentDescription = stringResource(id = R.string.poke_swipe_cd_favorites)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Main swipeable card
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 8.dp)
                .shadow(elevation = 8.dp, shape = MaterialTheme.shapes.small)
                .fillMaxWidth()
                .background(color = Color.Red, shape = MaterialTheme.shapes.small)
        ) {
            Box(modifier = Modifier.heightIn(min = 350.dp))
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Bottom nav bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 72.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // TODO: change icons later
            // temp icons
            Image(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.ball),
                contentDescription = stringResource(id = R.string.poke_swipe_cd_swiping)
            )
            Spacer(modifier = Modifier.width(48.dp))
            Image(
                modifier = Modifier.size(48.dp),
                painter = painterResource(id = R.drawable.folder),
                contentDescription = stringResource(id = R.string.poke_swipe_cd_liked)
            )
        }
    }
}