package com.aetherion.portfolio

import com.aetherion.core.StateVector
import kotlin.math.sqrt

class StateCorrelationEngine {
    fun similarity(a:StateVector,b:StateVector):Double{
        val dot = a.bias*b.bias + a.entropySlope*b.entropySlope + a.compression*b.compression + a.edgeStability*b.edgeStability
        val magA = magnitude(a)
        val magB = magnitude(b)
        return dot/(magA*magB + 1e-9)
    }
    private fun magnitude(v:StateVector):Double = sqrt(v.bias*v.bias+v.entropySlope*v.entropySlope+v.compression*v.compression+v.edgeStability*v.edgeStability)
}