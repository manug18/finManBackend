package com.finMan.model

import jakarta.persistence.*
import java.util.*

@Entity
data class PersonSpecificExpenseCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID?=null,

    var categoryName:String,


    var categoryImgUrl:String?,
    @ManyToOne
    @JoinColumn(name = "person_id")
    var person: Person?=null
) {
}