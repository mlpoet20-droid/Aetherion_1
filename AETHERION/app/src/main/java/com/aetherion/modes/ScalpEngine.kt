package com.aetherion.modes

import com.aetherion.core.StateVector

class ScalpEngine{
    fun amplify(state: StateVector): StateVector =
        state.copy(fluxRate=state.fluxRate*1.8, entropySlope=state.entropySlope*0.7)
}