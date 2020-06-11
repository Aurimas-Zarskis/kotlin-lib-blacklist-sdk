package com.paysera.lib.blacklist.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
data class Restriction(
    val id: Int,
    @Json(name = "user_id")
    val userId: String,
    val type: String?,
    val status: String?,
    @Json(name = "create_method")
    val createMethod: String?,
    @Json(name = "awaited_condition_removal_type")
    val awaitedConditionRemovalType: String?,
    @Json(name = "awaited_condition_type")
    val awaitedConditionType: String?,
    @Json(name = "created_at")
    val createdAt: Date?,
    @Json(name = "activates_at")
    val activatesAt: Date?,
    val hidden: Boolean?,
    @Json(name = "review_status")
    val reviewStatus: String?,
    val comments: List<RestrictionComment>?,
    @Json(name = "restricted_actions")
    val restrictedActions: List<RestrictionRestrictedAction>?,
    @Json(name = "resolved_at")
    val resolvedAt: Date?
)