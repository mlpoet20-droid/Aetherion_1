package com.aetherion.ui.chart

import com.aetherion.core.StateVector

data class StateOverlay(
    val biasLine:Double,
    val compressionZone:Double,
    val entropyColor:Int,
    val edgeAlpha:Float
)