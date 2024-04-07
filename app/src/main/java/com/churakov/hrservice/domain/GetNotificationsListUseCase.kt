package com.churakov.hrservice.domain

class GetNotificationsListUseCase(private val repository: Repository) {

    fun getNotifications(): List<Notification> {
        return repository.getNotifications()
    }
}