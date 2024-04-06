package com.churakov.hrservice.domain

data class Notification(
    val id: Int,
    val text: String,
    val date: String,
    val isRead: Boolean
)
