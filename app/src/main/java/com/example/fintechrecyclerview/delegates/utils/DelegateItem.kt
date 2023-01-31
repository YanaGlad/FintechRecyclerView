package com.example.fintechrecyclerview.delegates.utils

/**
 * @author y.gladkikh
 */
interface DelegateItem {
    fun content(): Any
    fun id(): Int
    fun compareToOther(other: DelegateItem): Boolean
}
