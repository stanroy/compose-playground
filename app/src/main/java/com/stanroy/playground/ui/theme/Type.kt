package com.stanroy.playground.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.stanroy.playground.R

// Set of Material typography styles to start with
//val Typography = Typography(
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    )
/* Other default text styles to override
titleLarge = TextStyle(
fontFamily = FontFamily.Default,
fontWeight = FontWeight.Normal,
fontSize = 22.sp,
lineHeight = 28.sp,
letterSpacing = 0.sp
),
labelSmall = TextStyle(
fontFamily = FontFamily.Default,
fontWeight = FontWeight.Medium,
fontSize = 11.sp,
lineHeight = 16.sp,
letterSpacing = 0.5.sp
)
*/
//)

object PlaygroundAppTypography {
    private val defaultAlignment = TextAlign.Start

    private val montserratFamily = FontFamily(
        Font(R.font.montserrat_regular, FontWeight.Normal),
        Font(R.font.montserrat_medium, FontWeight.Medium),
        Font(R.font.montserrat_italic, FontWeight.Normal, FontStyle.Italic),
        Font(R.font.montserrat_bold, FontWeight.Bold),
    )

    val typography = Typography(
        titleLarge = TextStyle(
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = defaultAlignment,
        ),
        titleMedium = TextStyle(
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            textAlign = defaultAlignment,
        ),
        bodyLarge = TextStyle(
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            textAlign = defaultAlignment,
        ),
        bodyMedium = TextStyle(
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            textAlign = defaultAlignment,
        ),
        labelSmall = TextStyle(
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            textAlign = defaultAlignment,
        )
    )
}