package com.aetherion.ui.chart

import com.aetherion.core.StateVector
import kotlin.math.abs

class StateChartEngine{
    fun overlay(state:StateVector):StateOverlay = StateOverlay(
        biasLine = state.bias,
        compressionZone = state.compression,
        entropyColor = entropyColor(state.entropySlope),
        edgeAlpha = state.edgeStability.toFloat()
    )
    private fun entropyColor(entropy:Double):Int = when{
        entropy<0.2 -> 0xFF00FF00.toInt()
        entropy<0.5 -> 0xFFFFFF00.toInt()
        else -> 0xFFFF0000.toInt()
    }
}