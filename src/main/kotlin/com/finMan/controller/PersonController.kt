package com.finMan.controller

import com.finMan.dto.Response
import com.finMan.model.Person
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.finMan.service.PersonService
import org.springframework.http.ResponseEntity


@RestController
@RequestMapping("/person")
class PersonController(
    private val personService: PersonService
) {
    @PostMapping
    fun addPerson(@RequestBody person: Person?): ResponseEntity<Response<Person>> {
        val person= personService.addPerson(person)
        return ResponseEntity.ok(Response(message = "Person added is " , data = person));
    }
}