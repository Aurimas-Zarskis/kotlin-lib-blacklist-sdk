package com.paysera.lib.blacklist.entities

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RestrictionComment(
    val id: Int,
    val comment: String,
    val type: String
)