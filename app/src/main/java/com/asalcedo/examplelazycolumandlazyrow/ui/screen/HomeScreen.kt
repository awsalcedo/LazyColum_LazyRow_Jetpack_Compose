package com.asalcedo.examplelazycolumandlazyrow.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asalcedo.examplelazycolumandlazyrow.ui.components.ConversationList
import com.asalcedo.examplelazycolumandlazyrow.ui.components.StoriesList
import com.asalcedo.examplelazycolumandlazyrow.ui.theme.ExampleLazyColumAndLazyRowTheme

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            StoriesList()
            ConversationList()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ExampleLazyColumAndLazyRowTheme {
        HomeScreen()
    }
}