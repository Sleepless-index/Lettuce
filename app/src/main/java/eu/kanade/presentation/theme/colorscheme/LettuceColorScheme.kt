package eu.kanade.presentation.theme.colorscheme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

internal object LettuceColorScheme : BaseColorScheme() {

    override val darkScheme = darkColorScheme(
        primary = Color(0xFF8FA8FF),
        onPrimary = Color(0xFF0B1020),
        primaryContainer = Color(0xFF2A3766),
        onPrimaryContainer = Color(0xFFDCE3FF),
        inversePrimary = Color(0xFF3F5BC4),
        secondary = Color(0xFF8FA8FF),
        onSecondary = Color(0xFF0B1020),
        secondaryContainer = Color(0xFF252E4D),
        onSecondaryContainer = Color(0xFF8FA8FF),
        tertiary = Color(0xFF7FD1B9),
        onTertiary = Color(0xFF06201A),
        tertiaryContainer = Color(0xFF1F5B4B),
        onTertiaryContainer = Color(0xFFCDEFE5),
        background = Color(0xFF0E1014),
        onBackground = Color(0xFFECEEF2),
        surface = Color(0xFF0E1014),
        onSurface = Color(0xFFECEEF2),
        surfaceVariant = Color(0xFF1D2129),
        onSurfaceVariant = Color(0xFF98A0AE),
        surfaceTint = Color(0xFF8FA8FF),
        inverseSurface = Color(0xFFECEEF2),
        inverseOnSurface = Color(0xFF14171F),
        outline = Color(0xFF6B7385),
        surfaceContainerLowest = Color(0xFF0A0C10),
        surfaceContainerLow = Color(0xFF12151B),
        surfaceContainer = Color(0xFF161920),
        surfaceContainerHigh = Color(0xFF1A1D24),
        surfaceContainerHighest = Color(0xFF1D2129),
        outlineVariant = Color(0xFF262B35),
    )

    override val lightScheme = lightColorScheme(
        primary = Color(0xFF3F5BC4),
        onPrimary = Color(0xFFFFFFFF),
        primaryContainer = Color(0xFFDCE3FF),
        onPrimaryContainer = Color(0xFF0B1A4A),
        inversePrimary = Color(0xFF8FA8FF),
        secondary = Color(0xFF3F5BC4),
        onSecondary = Color(0xFFFFFFFF),
        secondaryContainer = Color(0xFFDCE3FF),
        onSecondaryContainer = Color(0xFF1F2F6B),
        tertiary = Color(0xFF1F7A63),
        onTertiary = Color(0xFFFFFFFF),
        tertiaryContainer = Color(0xFFBFEBDD),
        onTertiaryContainer = Color(0xFF06201A),
        background = Color(0xFFF7F8FB),
        onBackground = Color(0xFF14171F),
        surface = Color(0xFFF7F8FB),
        onSurface = Color(0xFF14171F),
        surfaceVariant = Color(0xFFE6E9F2),
        onSurfaceVariant = Color(0xFF4A5160),
        surfaceTint = Color(0xFF3F5BC4),
        inverseSurface = Color(0xFF2A2F3A),
        inverseOnSurface = Color(0xFFF1F3F9),
        outline = Color(0xFF7C8494),
        surfaceContainerLowest = Color(0xFFFFFFFF),
        surfaceContainerLow = Color(0xFFF1F3F9),
        surfaceContainer = Color(0xFFEBEEF6),
        surfaceContainerHigh = Color(0xFFE4E8F2),
        surfaceContainerHighest = Color(0xFFDDE2EE),
        outlineVariant = Color(0xFFD3D8E4),
    )
}
