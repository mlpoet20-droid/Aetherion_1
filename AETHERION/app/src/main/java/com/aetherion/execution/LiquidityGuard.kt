package com.aetherion.execution

class LiquidityGuard{
    fun pressure(liq: LiquidityState): Double = liq.spread*0.4 + liq.tickVelocity*0.35 + liq.rejectionRate*0.25
    fun safe(liq: LiquidityState): Boolean = pressure(liq)<0.65
}