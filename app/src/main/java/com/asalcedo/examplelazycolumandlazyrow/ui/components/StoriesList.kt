package com.asalcedo.examplelazycolumandlazyrow.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asalcedo.examplelazycolumandlazyrow.R
import com.asalcedo.examplelazycolumandlazyrow.ui.theme.ExampleLazyColumAndLazyRowTheme

@Composable
fun StoriesList() {
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(10) {
            Image(
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.icons8_avatar_67__3_),
                contentDescription = "User's profile picture"
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun StorieListPreview() {
    ExampleLazyColumAndLazyRowTheme {
        StoriesList()
    }
}