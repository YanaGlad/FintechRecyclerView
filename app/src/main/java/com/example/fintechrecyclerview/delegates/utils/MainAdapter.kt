package com.example.fintechrecyclerview.delegates.utils

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

/**
 * @author y.gladkikh
 */
class MainAdapter : ListAdapter<DelegateItem, RecyclerView.ViewHolder>(DelegateAdapterItemCallback()) {
    //список Адаптеров-делегатов для разных вью элементов
    private val delegates: MutableList<AdapterDelegate> = mutableListOf()

    //
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        delegates[viewType].onCreateViewHolder(parent)

    //
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegates[getItemViewType(position)].onBindViewHolder(holder, getItem(position), position)
    }

    fun addDelegate(delegate: AdapterDelegate) {
        delegates.add(delegate)
    }

    //Вернет тип элемента по его позиции в списке
    override fun getItemViewType(position: Int): Int {
        return delegates.indexOfFirst { it.isOfViewType(currentList[position]) }
    }
}
