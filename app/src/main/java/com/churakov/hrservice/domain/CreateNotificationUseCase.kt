package com.churakov.hrservice.domain

class CreateNotificationUseCase(private val repository: Repository) {

    fun createNotification(): Notification {
        return repository.createNotification()
    }
}