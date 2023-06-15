package com.infinitelearning.savoricious

var menuDetaillist = mutableListOf<MenuDetail>()

val MENU_ID_EXTRA = "menuExtra"

class MenuDetail (
    var profile: Int,
    var nama: String,
    var menu: Int,
    var namamenu: String,
    var rating: String,
    var waktu: String,
    var dilihat: String,
    var description: String,
    val id: Int? = menuDetaillist.size

)