package com.aetherion.execution

import com.aetherion.execution.broker.BrokerAPI
import com.aetherion.execution.broker.OrderSide

class TradeManager(private val broker: BrokerAPI) {
    fun openTrade(symbol: String, qty: Double, side: OrderSide) {
        if (broker.searchSymbol(symbol)) {
            broker.placeOrder(symbol, qty, side)
        } else {
            println("Symbol $symbol not found")
        }
    }

    fun getAccountStatus() {
        val balance = broker.getBalance()
        val openTrades = broker.getOpenTrades()
        println("Balance: $balance")
        println("Open Trades: $openTrades")
    }
}