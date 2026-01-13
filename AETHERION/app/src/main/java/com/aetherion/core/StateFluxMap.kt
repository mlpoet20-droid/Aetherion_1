package com.aetherion.core

class StateFluxMap {
    fun deriveState(priceHistory: List<Double>, volumeHistory: List<Double>): StateVector {
        val bias = directionalBias(priceHistory)
        val entropy = entropySlope(priceHistory)
        val compression = volatilityCompression(priceHistory)
        val flux = fluxRate(priceHistory)
        val stability = edgeStability(bias, entropy, compression)
        return StateVector(bias, entropy, compression, flux, stability)
    }
    private fun directionalBias(p: List<Double>): Double = (p.last() - p.first()) / (p.maxOrNull()!! - p.minOrNull()!! + 1e-6)
    private fun entropySlope(p: List<Double>): Double = p.zipWithNext { a,b -> kotlin.math.abs(b-a) }.average()
    private fun volatilityCompression(p: List<Double>): Double = 1.0 / (p.maxOrNull()!! - p.minOrNull()!! + 1e-6)
    private fun fluxRate(p: List<Double>): Double = kotlin.math.abs(p.last() - p[p.size//2])
    private fun edgeStability(b: Double, e: Double, c: Double): Double = (kotlin.math.abs(b)+c)/(e+1e-6)
}