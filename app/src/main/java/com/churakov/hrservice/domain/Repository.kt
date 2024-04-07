package com.churakov.hrservice.domain

interface Repository {

    //candidate methods
    fun addCandidate(candidate: Candidate)
    fun getCandidate(): Candidate
    //user methods
    fun getUser(): User
    fun getUsers(): List<User>
    fun changeUserData(user: User)
    //notification methods
    fun createNotification(): Notification
    fun getNotifications(): List<Notification>
}