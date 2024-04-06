package com.churakov.hrservice.domain

class GetUserUseCase(private val repository: Repository) {

    fun getUser(): User {
        return repository.getUser()
    }
}