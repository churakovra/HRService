package com.churakov.hrservice.domain

class GetCandidateUseCase(private val repository: Repository) {

    fun getCandidate(): Candidate {
        return repository.getCandidate()
    }
}