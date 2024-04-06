package com.churakov.hrservice.domain

data class User(
    val id: Int,
    val role: Int,
    val firstName: String,
    val lastName: String,
    val birthday: String,
    val email: String,
    val isOnline: Boolean
)
