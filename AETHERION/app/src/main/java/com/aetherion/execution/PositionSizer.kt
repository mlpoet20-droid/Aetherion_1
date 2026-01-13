package com.aetherion.execution

import com.aetherion.core.StateVector

class PositionSizer {
    fun size(balance: Double, state: StateVector): Double{
        val riskUnit = balance*0.002
        val modifier = state.edgeStability / (state.entropySlope + 1e-6)
        return (riskUnit*modifier).coerceAtMost(balance*0.03)
    }
}