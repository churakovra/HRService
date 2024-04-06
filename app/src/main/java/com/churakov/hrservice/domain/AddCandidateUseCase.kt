package com.churakov.hrservice.domain

class AddCandidateUseCase(private val repository: Repository) {

    fun addCandidate(candidate: Candidate) {
        repository.addCandidate(candidate)
    }
}