package com.aetherion.learning

import com.aetherion.core.StateVector

data class ArchivedState(
    val state: StateVector,
    val outcome: Double,
    val duration: Long,
    val edgeAtEntry: Double
)