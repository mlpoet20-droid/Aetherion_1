package com.aetherion.execution

class MT5Bridge: BrokerBridge{
    override fun connect(credentials: Map<String,String>): Boolean = true
    override fun symbols(): List<String> = listOf("EURUSD","USDJPY")
    override fun price(symbol:String): Double = 0.0
    override fun liquidity(symbol:String): LiquidityState = LiquidityState(0.2,0.3,0.1)
    override fun placeOrder(symbol:String, side:String, size:Double) {}
    override fun close(positionId:String) {}
}