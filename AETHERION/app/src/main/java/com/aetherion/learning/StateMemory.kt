package com.aetherion.learning

class StateMemory{
    private val archive = mutableListOf<ArchivedState>()
    fun record(state: ArchivedState){archive+=state}
    fun history():List<ArchivedState> = archive
}