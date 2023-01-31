package com.example.fintechrecyclerview.delegates.utils

import com.example.fintechrecyclerview.delegates.date.DateDelegateItem
import com.example.fintechrecyclerview.delegates.date.DateModel
import com.example.fintechrecyclerview.delegates.expense.ExpenseDelegateItem
import com.example.fintechrecyclerview.delegates.expense.ExpenseModel

/**
 * Created by y.gladkikh
 */

fun List<ExpenseModel>.concatenateWithDate(dates: List<DateModel>): List<DelegateItem> {
    val delegateItemList: MutableList<DelegateItem> = mutableListOf()

    dates.forEach { dateModel ->

        // Сразу добавляем в список дату
        delegateItemList.add(
            DateDelegateItem(id = dateModel.id, value = dateModel)
        )

        val date = dateModel.date
        // Выбираем покупки по дате
        val allDayExpenses = this.filter { expense ->
            expense.date == date
        }
        // Добавляем эти покупки
        allDayExpenses.forEach { model ->
            delegateItemList.add(
                ExpenseDelegateItem(
                    id = model.id,
                    value = model,
                )
            )
        }
    }
    return delegateItemList
}
