package com.finMan.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class GeneralExpenseCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id:UUID?=null,

    var categoryName:String,

    var categoryImgUrl:String?

)