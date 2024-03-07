package com.asalcedo.examplelazycolumandlazyrow.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.asalcedo.examplelazycolumandlazyrow.model.Conversation

@Composable
fun ConversationItem(conversation: Conversation) {
    Card(
        modifier = Modifier.padding(bottom = 12.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
                    .clip(CircleShape),
                painter = painterResource(id = conversation.user.avatar),
                contentDescription = "User's profile picture"
            )
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f)
            ) {
                Text(
                    modifier = Modifier.padding(4.dp),
                    text = conversation.user.fullName,
                    fontWeight = FontWeight.Bold
                )
                Text(modifier = Modifier.padding(4.dp), text = conversation.messages[0].text)
            }
            Text(modifier = Modifier.padding(8.dp), text = conversation.messages[0].timeCreated)
        }
    }
}