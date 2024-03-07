package com.asalcedo.examplelazycolumandlazyrow.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asalcedo.examplelazycolumandlazyrow.model.conversations
import com.asalcedo.examplelazycolumandlazyrow.ui.theme.ExampleLazyColumAndLazyRowTheme

@Composable
fun ConversationList() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 8.dp, bottom = 8.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "My Chats",
                    style = TextStyle(
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            items(conversations) { conversation ->
                ConversationItem(conversation)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConversationListPreview() {
    ExampleLazyColumAndLazyRowTheme {
        ConversationList()
    }
}