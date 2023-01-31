package com.example.fintechrecyclerview.listadapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fintechrecyclerview.databinding.FragmentListAdapterBinding
import com.example.fintechrecyclerview.stubExpenseList

/**
 * @author y.gladkikh
 */
class ListAdapterFragment : Fragment() {

    private var _binding: FragmentListAdapterBinding? = null
    private val binding get() = _binding!!

    private lateinit var expensesListAdapter: ExpensesListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListAdapterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        binding.recycler.adapter = expensesListAdapter
        expensesListAdapter.submitList(stubExpenseList)
    }

    private fun initAdapter() {
        val onClickListener = object : OnExpenseClickListener {
            override fun onClick(position: Int) {
                removeItem(position)
            }
        }
        expensesListAdapter = ExpensesListAdapter(onClickListener)
    }

    private fun removeItem(position: Int) {
        val currentList = expensesListAdapter.currentList.toMutableList()
        currentList.removeAt(position)
        expensesListAdapter.submitList(currentList.toList())
    }

    companion object {
        const val TAG = "ListAdapterFragment TAG"
    }
}
