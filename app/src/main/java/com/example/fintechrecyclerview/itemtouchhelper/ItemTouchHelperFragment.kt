package com.example.fintechrecyclerview.itemtouchhelper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ItemTouchHelper
import com.example.fintechrecyclerview.databinding.FragmentItemTouchHelperBinding
import com.example.fintechrecyclerview.stubExpenseList

/**
 * @author y.gladkikh
 */
class ItemTouchHelperFragment : Fragment() {

    private var _binding: FragmentItemTouchHelperBinding? = null
    private val binding get() = _binding!!

    private lateinit var expensesTouchAdapter: ExpensesTouchAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemTouchHelperBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        binding.recycler.adapter = expensesTouchAdapter
    }

    private fun initAdapter() {
        expensesTouchAdapter = ExpensesTouchAdapter(stubExpenseList)

        val callback: ItemTouchHelper.Callback = SimpleItemTouchHelperCallback(expensesTouchAdapter)
        val touchHelper = ItemTouchHelper(callback)
        touchHelper.attachToRecyclerView(binding.recycler)
    }

    companion object {
        const val TAG = "ItemTouchHelperFragment TAG"
    }
}
