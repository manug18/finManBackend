package com.finMan.service

import com.finMan.model.GeneralExpenseCategory
import com.finMan.repository.GeneralExpenseCategoryRepository
import org.springframework.stereotype.Service

@Service
class ExpenseCategoryService(
    private val generalExpenseCategoryRepository: GeneralExpenseCategoryRepository
) {
    fun addGeneralExpenseCategory(generalExpenseCategoryRequest: GeneralExpenseCategory): List<GeneralExpenseCategory> {
         generalExpenseCategoryRepository.save(generalExpenseCategoryRequest)
        return generalExpenseCategoryRepository.findAll();
    }
}