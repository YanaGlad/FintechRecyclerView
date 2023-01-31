package com.example.fintechrecyclerview.itemtouchhelper

/**
 * @author y.gladkikh
 */
interface ItemTouchHelperAdapter {

    fun onItemMove(fromPosition: Int, toPosition: Int)

    fun onItemDismiss(position: Int)
}
