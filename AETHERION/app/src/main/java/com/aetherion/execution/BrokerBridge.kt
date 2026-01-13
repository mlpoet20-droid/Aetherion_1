package com.aetherion.execution

import com.aetherion.execution.LiquidityState

interface BrokerBridge {
    fun connect(credentials: Map<String,String>): Boolean
    fun symbols(): List<String>
    fun price(symbol:String): Double
    fun liquidity(symbol:String): LiquidityState
    fun placeOrder(symbol:String, side:String, size:Double)
    fun close(positionId:String)
}