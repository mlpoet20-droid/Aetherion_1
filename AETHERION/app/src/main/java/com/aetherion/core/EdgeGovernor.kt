package com.aetherion.core

class EdgeGovernor {
    private var halted = False
    fun evaluate(edge: Double, drawdown: Double): Boolean {
        halted = edge < 0.35 || drawdown > 0.12
        return !halted
    }
    fun isHalted(): Boolean = halted
}