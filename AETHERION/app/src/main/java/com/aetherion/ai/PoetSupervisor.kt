package com.aetherion.ai

class PoetSupervisor{
    fun adjustEntryThreshold(base:Double, winRate:Double, edge:Double):Double = when{
        winRate>0.6 && edge>0.6 -> base*0.9
        winRate<0.45 -> base*1.15
        else -> base
    }
    fun adjustRiskMultiplier(drawdown:Double):Double = if(drawdown>0.08) 0.7 else 1.0
}