package com.finMan.service

import com.finMan.model.Person
import org.springframework.stereotype.Service
import com.finMan.repository.PersonRepository


@Service
class PersonService(
    private val personRepository: PersonRepository
) {
    fun addPerson(person: Person?): Person {
        return personRepository.save(person!!)
    }
}