package com.stanroy.playground.ui.common

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val windowHorizontalSpacing = 24.dp
val windowVerticalSpacing = 24.dp

val Modifier.defaultHorizontalPadding: Modifier
    get() = this.padding(horizontal = windowHorizontalSpacing)

val Modifier.defaultVerticalPadding: Modifier
    get() = this.padding(vertical = windowVerticalSpacing)

val Modifier.defaultWindowPadding: Modifier
    get() = this.padding(horizontal = windowHorizontalSpacing, vertical = windowVerticalSpacing)