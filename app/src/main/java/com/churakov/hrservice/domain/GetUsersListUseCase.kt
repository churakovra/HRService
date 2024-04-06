package com.churakov.hrservice.domain

class GetUsersListUseCase(private val repository: Repository) {

    fun getUsers(): List<User> {
        return repository.getUsers()
    }
}