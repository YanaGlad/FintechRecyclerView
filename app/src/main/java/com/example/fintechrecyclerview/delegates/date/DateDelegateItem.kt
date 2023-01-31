package com.example.fintechrecyclerview.delegates.date

import com.example.fintechrecyclerview.delegates.utils.DelegateItem

/**
 * @author y.gladkikh
 */
class DateDelegateItem(
    val id: Int,
    private val value: DateModel,
) : DelegateItem {
    override fun content(): Any = value

    override fun id(): Int = id

    override fun compareToOther(other: DelegateItem): Boolean {
        return (other as DateDelegateItem).value == content()
    }
}