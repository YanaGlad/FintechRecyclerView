package com.example.fintechrecyclerview.itemtouchhelper

import androidx.lifecycle.ViewModel
import com.example.fintechrecyclerview.model.ExpenseModel
import com.example.fintechrecyclerview.stubExpenseList

/**
 * @author by y.gladkikh
 */
class TouchHelperViewModel : ViewModel() {

    val list: MutableList<ExpenseModel> = stubExpenseList
}
