package com.aetherion.learning

import com.aetherion.core.StateVector

class ClusterEngine{
    fun dominantStates(states:List<ArchivedState>): List<StateVector>{
        return states.groupBy{bucket(it.state)}
                     .filter{it.value.averageOutcome()>0}
                     .map{it.value.map{a->a.state}.average()}
    }
    private fun bucket(state: StateVector): Int = ((state.bias+1)*5).toInt().coerceIn(0,9)
}
private fun List<ArchivedState>.averageOutcome():Double = map{it.outcome}.average()
private fun List<StateVector>.average():StateVector = StateVector(
    bias = map{it.bias}.average(),
    entropySlope = map{it.entropySlope}.average(),
    compression = map{it.compression}.average(),
    fluxRate = map{it.fluxRate}.average(),
    edgeStability = map{it.edgeStability}.average()
)