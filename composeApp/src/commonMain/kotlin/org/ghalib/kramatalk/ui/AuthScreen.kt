package org.ghalib.kramatalk.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import org.ghalib.kramatalk.theme.DarkColors
import org.ghalib.kramatalk.theme.LightColors
import org.ghalib.kramatalk.theme.containerColor
import org.ghalib.kramatalk.theme.textColor

@Composable
fun AuthScreen() {
    MaterialTheme (
        colorScheme = if(isSystemInDarkTheme()) DarkColors else LightColors
    ) {
        Surface {
            Column(
                modifier = Modifier.background(containerColor)
            ) {
                repeat(10){
                    Text(
                        color = textColor,
                        text = "Haloo $it"
                    )
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = if (isSystemInDarkTheme()) "Dark Theme" else "Light Theme",
                        fontSize = 60.sp,
                        color = textColor,
                        textAlign = TextAlign.Center
                    )
                }
            }

        }

    }
}