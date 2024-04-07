package com.churakov.hrservice.data

import com.churakov.hrservice.domain.Candidate
import com.churakov.hrservice.domain.Notification
import com.churakov.hrservice.domain.Repository
import com.churakov.hrservice.domain.User

object RepositoryImpl : Repository {
    override fun addCandidate(candidate: Candidate) {
        TODO("Not yet implemented")
    }

    override fun getCandidate(): Candidate {
        TODO("Not yet implemented")
    }

    override fun getUser(): User {
        TODO("Not yet implemented")
    }

    override fun getUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override fun changeUserData(user: User) {
        TODO("Not yet implemented")
    }

    override fun createNotification(): Notification {
        TODO("Not yet implemented")
    }

    override fun getNotifications(): List<Notification> {
        TODO("Not yet implemented")
    }
}