package com.aetherion.core

data class StateVector(
    val bias: Double,
    val entropySlope: Double,
    val compression: Double,
    val fluxRate: Double,
    val edgeStability: Double
)