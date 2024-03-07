package com.asalcedo.examplelazycolumandlazyrow.model

import com.asalcedo.examplelazycolumandlazyrow.R

data class Conversation(
    val user: User,
    val messages: List<Message>
)

val conversations = listOf(
    Conversation(
        user = User("Javier", R.drawable.icons8_avatar_67),
        messages = listOf(
            Message("12:00", "Hello"),
            Message("12:01", "Hi")
        )
    ),
    Conversation(
        user = User("Pedro", R.drawable.icons8_avatar_67__1_),
        messages = listOf(
            Message("19:00", "Hello"),
            Message("19:01", "Hi")
        )
    ),
    Conversation(
        user = User("Carlos", R.drawable.icons8_avatar_67__2_),
        messages = listOf(
            Message("20:00", "Hello"),
            Message("20:01", "Hi")
        )
    ),
    Conversation(
        user = User("Pablo", R.drawable.icons8_avatar_67__3_),
        messages = listOf(
            Message("21:00", "Hello"),
            Message("21:01", "Hi")
        )
    ),
    Conversation(
        user = User("Alex", R.drawable.icons8_avatar_67),
        messages = listOf(
            Message("22:00", "Hello"),
            Message("22:01", "Hi")
        )
    ),
    Conversation(
        user = User("Alfredo", R.drawable.icons8_avatar_67__1_),
        messages = listOf(
            Message("23:00", "Hello"),
            Message("23:01", "Hi")
        )
    ),
    Conversation(
        user = User("Carlos", R.drawable.icons8_avatar_67__2_),
        messages = listOf(
            Message("24:00", "Hello"),
            Message("24:01", "Hi")
        )
    ),
    Conversation(
        user = User("Pepe", R.drawable.icons8_avatar_67__3_),
        messages = listOf(
            Message("01:00", "Hello"),
            Message("01:01", "Hi")
        )
    ),
    Conversation(
        user = User("Javier", R.drawable.icons8_avatar_67),
        messages = listOf(
            Message("02:00", "Hello"),
            Message("02:01", "Hi")
        )
    ),
    Conversation(
        user = User("Pedro", R.drawable.icons8_avatar_67__1_),
        messages = listOf(
            Message("03:00", "Hello"),
            Message("03:01", "Hi")
        )
    ),
    Conversation(
        user = User("Carlos", R.drawable.icons8_avatar_67__2_),
        messages = listOf(
            Message("04:00", "Hello"),
            Message("04:01", "Hi")
        )
    ),
    Conversation(
        user = User("Wilmer", R.drawable.icons8_avatar_67__3_),
        messages = listOf(
            Message("05:00", "Hello"),
            Message("05:01", "Hi")
        )
    ),
    Conversation(
        user = User("Miguel", R.drawable.icons8_avatar_67),
        messages = listOf(
            Message("06:00", "Hello"),
            Message("06:01", "Hi")
        )
    ),
    Conversation(
        user = User("Diego", R.drawable.icons8_avatar_67__1_),
        messages = listOf(
            Message("07:00", "Hello"),
            Message("07:01", "Hi")
        )
    ),
    Conversation(
        user = User("Carlos", R.drawable.icons8_avatar_67__2_),
        messages = listOf(
            Message("08:00", "Hello"),
            Message("08:01", "Hi")
        )
    ),
    Conversation(
        user = User("Luis", R.drawable.icons8_avatar_67__3_),
        messages = listOf(
            Message("09:00", "Hello"),
            Message("09:01", "Hi")
        )
    ),
    Conversation(
        user = User("Javier", R.drawable.icons8_avatar_67),
        messages = listOf(
            Message("10:00", "Hello"),
            Message("10:01", "Hi")
        )
    ),
    Conversation(
        user = User("Pedro", R.drawable.icons8_avatar_67__1_),
        messages = listOf(
            Message("11:00", "Hello"),
            Message("11:01", "Hi")
        )
    ),
    Conversation(
        user = User("Carlos", R.drawable.icons8_avatar_67__2_),
        messages = listOf(
            Message("12:00", "Hello"),
            Message("12:01", "Hi")
        )
    )
)
