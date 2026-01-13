package com.aetherion.core
class StateFluxMap { fun deriveState(priceHistory: List<Double>) = StateVector(priceHistory.last()-priceHistory.first(),0.0,0.0,0.0,0.0) }