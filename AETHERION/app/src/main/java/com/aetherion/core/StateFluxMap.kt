package com.aetherion.core
class StateFluxMap {
    fun deriveState(priceHistory: List<Double>): StateVector {
        val bias = priceHistory.last() - priceHistory.first()
        return StateVector(bias, 0.0, 0.0, 0.0, 0.0)
    }
}