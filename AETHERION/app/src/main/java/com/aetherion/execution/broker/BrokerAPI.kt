package com.aetherion.execution.broker

interface BrokerAPI {
    fun connect(apiKey: String, secret: String): Boolean
    fun disconnect(): Boolean
    fun searchSymbol(symbol: String): Boolean
    fun getPrice(symbol: String): Double
    fun placeOrder(symbol: String, quantity: Double, side: OrderSide): Boolean
    fun getOpenTrades(): List<Trade>
    fun getBalance(): Double
}

enum class OrderSide { BUY, SELL }

data class Trade(val symbol: String, val quantity: Double, val price: Double, val side: OrderSide, val timestamp: Long)