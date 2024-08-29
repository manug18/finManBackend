package com.finMan.controller

import com.finMan.dto.Response
import com.finMan.model.GeneralExpenseCategory
import com.finMan.service.ExpenseCategoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/expenseCategory")
class ExpenseCategoryController(
    private val expenseCategoryService: ExpenseCategoryService
) {
    @PostMapping
    fun addGeneralCategory(@RequestBody generalExpenseCategoryRequest: GeneralExpenseCategory): ResponseEntity<Response<List<GeneralExpenseCategory>>> {
        val addedExpenseCategory = expenseCategoryService.addGeneralExpenseCategory(generalExpenseCategoryRequest);
        return ResponseEntity.ok(Response(message = "Added category",data = addedExpenseCategory))

    }
}