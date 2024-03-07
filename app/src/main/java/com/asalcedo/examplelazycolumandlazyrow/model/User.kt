package com.asalcedo.examplelazycolumandlazyrow.model

import androidx.annotation.DrawableRes

data class User(
    val fullName: String,
    @DrawableRes val avatar: Int
)
