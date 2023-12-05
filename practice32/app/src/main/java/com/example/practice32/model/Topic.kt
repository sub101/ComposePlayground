package com.example.practice32.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title: Int,
    val num: Int,
    @DrawableRes val mainImg: Int,
)
