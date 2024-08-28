package com.finMan.model

import jakarta.persistence.*
import java.util.*

@Entity

data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null,

    var name:String,

    @OneToMany(mappedBy = "person")

    val expenseCategories: MutableList<PersonSpecificExpenseCategory> = mutableListOf()

    )
