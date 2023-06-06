package com.example.easytospeak

import  android.content.ClipData.Item

data class Items(val imageId: Int, val title: String)
class ItemsList  {val list = arrayListOf(
    Items(R.drawable.item0, "Past Simple"),
    Items(R.drawable.item1, "Past Perfect"),
    Items(R.drawable.item2, "Past Continious"),
    Items(R.drawable.item3, "Present Simple"),
    Items(R.drawable.item4, "Present Perfect"),
    Items(R.drawable.item5, "Present Continious"),
    Items(R.drawable.item6, "Future Simple"),
    Items(R.drawable.item7, "Future Perfect"),
    Items(R.drawable.item8, "Future ontinious"),
)}