package com.aetherion.core

class ReactionManifestField {
    fun integrationValue(state: StateVector): Double = state.bias * state.edgeStability
    fun disintegrationValue(state: StateVector): Double = state.entropySlope / (state.compression + 1e-6)
    fun equilibriumDeviation(state: StateVector): Double = integrationValue(state) - disintegrationValue(state)
}