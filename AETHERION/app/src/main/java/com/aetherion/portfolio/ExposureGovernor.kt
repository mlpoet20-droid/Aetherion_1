package com.aetherion.portfolio

import com.aetherion.core.StateVector

class ExposureGovernor{
    private val openStates = mutableListOf<StateVector>()
    private val engine = StateCorrelationEngine()
    fun allow(state: StateVector): Boolean = openStates.none{engine.similarity(it,state)>0.72}
    fun register(state: StateVector){openStates += state}
    fun release(state: StateVector){openStates.remove(state)}
}