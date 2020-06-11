package com.paysera.lib.blacklist.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RestrictionRestrictedAction(
    val id: Int,
    val action: String
)