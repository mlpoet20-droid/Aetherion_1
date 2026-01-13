package com.aetherion.core

class EdgeEngine {
    private var edgeScore = 1.0
    fun update(state: StateVector): Double {
        val decay = state.entropySlope*0.15
        val regen = state.edgeStability*0.08
        edgeScore += regen - decay
        edgeScore = edgeScore.coerceIn(0.0,1.0)
        return edgeScore
    }
    fun tradable(): Boolean = edgeScore > 0.42
}