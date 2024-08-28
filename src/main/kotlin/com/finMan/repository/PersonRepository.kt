package com.finMan.repository

import com.finMan.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository

interface PersonRepository:JpaRepository<Person,UUID> {
}