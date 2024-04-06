package com.churakov.hrservice.domain

class ChangeUserDataUseCase(private val repository: Repository) {

    fun changeUserData(user: User) {
        repository.changeUserData(user)
    }
}