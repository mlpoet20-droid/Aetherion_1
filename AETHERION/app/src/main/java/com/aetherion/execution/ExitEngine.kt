package com.aetherion.execution

import com.aetherion.core.*

class ExitEngine {
    fun shouldExit(entryState: StateVector, current: StateVector): Boolean{
        val biasFlip = entryState.bias*current.bias<0
        val entropySpike = current.entropySlope > entryState.entropySlope*1.8
        return biasFlip || entropySpike
    }
}