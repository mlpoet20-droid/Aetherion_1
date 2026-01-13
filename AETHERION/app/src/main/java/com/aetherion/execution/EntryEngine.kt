package com.aetherion.execution

import com.aetherion.core.*

class EntryEngine(private val rmf: ReactionManifestField, private val edge: EdgeEngine){
    fun shouldEnter(state: StateVector): Boolean{
        if(!edge.tradable()) return false
        val deviation = rmf.equilibriumDeviation(state)
        return deviation > 0.35 && state.fluxRate > 0.2
    }
    fun direction(state: StateVector): String = if(state.bias>0) "BUY" else "SELL"
}