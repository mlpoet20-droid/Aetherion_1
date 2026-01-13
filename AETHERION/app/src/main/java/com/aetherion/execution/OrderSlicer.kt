package com.aetherion.execution

class OrderSlicer {
    fun slice(size: Double): List<Double>{
        val slices = mutableListOf<Double>()
        var remaining = size
        while(remaining>0){
            val chunk = (size*0.15).coerceAtMost(remaining)
            slices += chunk
            remaining -= chunk
        }
        return slices
    }
}