package com.aetherion.execution.broker

import kotlin.random.Random

class DemoBroker: BrokerAPI {
    private var connected = false
    private var balance = 10000.0
    private val trades = mutableListOf<Trade>()
    override fun connect(apiKey:String, secret:String)=run { connected=true; println("Connected"); true }
    override fun disconnect()=run { connected=false; !connected }
    override fun searchSymbol(symbol:String)=true
    override fun getPrice(symbol:String)=100+Random.nextDouble(-5.0,5.0)
    override fun placeOrder(symbol:String, quantity:Double, side:OrderSide)=run {
        trades.add(Trade(symbol,quantity,getPrice(symbol),side,System.currentTimeMillis()))
        if(side==OrderSide.BUY) balance-=quantity*getPrice(symbol)
        println("Order placed: ${trades.last()}"); true
    }
    override fun getOpenTrades()=trades
    override fun getBalance()=balance
}