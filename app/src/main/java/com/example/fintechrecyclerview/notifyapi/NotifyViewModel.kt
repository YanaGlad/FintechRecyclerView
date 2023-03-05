package com.example.fintechrecyclerview.notifyapi

import androidx.lifecycle.ViewModel
import com.example.fintechrecyclerview.model.ExpenseModel
import com.example.fintechrecyclerview.stubExpenseList

/**
 * @author by y.gladkikh
 */
class NotifyViewModel : ViewModel() {

    val list: MutableList<ExpenseModel> = stubExpenseList
}
