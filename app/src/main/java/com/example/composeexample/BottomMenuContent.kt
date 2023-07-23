package com.example.composeexample

import androidx.annotation.DrawableRes

data class BottomMenuContent (
    val title:String,
    @DrawableRes val iconId:Int
)