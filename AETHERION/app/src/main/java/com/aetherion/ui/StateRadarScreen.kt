package com.aetherion.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*

@Composable
fun StateRadarScreen(){
    Column(modifier=Modifier.fillMaxSize().padding(16.dp)){
        Text("ÆTHERION – State Radar", style=MaterialTheme.typography.headlineMedium)
        Spacer(modifier=Modifier.height(16.dp))
        Text("Live State | Flux | Edge | Liquidity")
    }
}