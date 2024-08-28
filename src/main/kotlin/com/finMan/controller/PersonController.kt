package com.finMan.controller

import com.finMan.model.Person
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.finMan.service.PersonService


@RestController
@RequestMapping("/person")
class PersonController (
    private val personService: PersonService
){
    @PostMapping
    fun addPerson(@RequestBody person: Person?): Person {
        return personService.addPerson(person)
    }
}