package com.example.fintechrecyclerview.delegates.utils

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * @author y.gladkikh
 */
interface AdapterDelegate {
    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: DelegateItem, position: Int)
    fun isOfViewType(item: DelegateItem): Boolean
}
