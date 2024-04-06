package com.churakov.hrservice.domain

data class Candidate(
    val id: Int,
    val passport: String,
    val firstName: String,
    val lastName: String,
    val patronymic: String,
    val birthday: String,
    val citizenship: String,
    val phoneNumber: String,
    val email: String
)
