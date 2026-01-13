package com.aetherion.modes

class ExtractionEngine{
    fun exposure(balance:Double):Double = when{
        balance<100->0.04
        balance<1000->0.025
        balance<10000->0.015
        balance<100000->0.008
        else->0.003
    }
}