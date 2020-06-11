package com.paysera.lib.blacklist.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RestrictionFilter(
    val statuses: List<String>?,
    val hidden: Boolean?,
    @Json(name = "user_id")
    val userId: Int
)