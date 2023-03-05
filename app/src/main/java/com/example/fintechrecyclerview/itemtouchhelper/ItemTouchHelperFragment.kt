package com.example.fintechrecyclerview.itemtouchhelper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.ItemTouchHelper
import com.example.fintechrecyclerview.databinding.FragmentItemTouchHelperBinding
import com.example.fintechrecyclerview.itemtouchhelper.adapters.ExpensesTouchAdapter
import com.example.fintechrecyclerview.itemtouchhelper.adapters.SimpleItemTouchHelperCallback

/**
 * @author y.gladkikh
 */
class ItemTouchHelperFragment : Fragment() {

    private var _binding: FragmentItemTouchHelperBinding? = null
    private val binding get() = _binding!!

    private val touchHelperViewModel: TouchHelperViewModel by viewModels()

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
        expensesTouchAdapter = ExpensesTouchAdapter(touchHelperViewModel.list)

        val callback: ItemTouchHelper.Callback = SimpleItemTouchHelperCallback(expensesTouchAdapter)
        val touchHelper = ItemTouchHelper(callback)
        touchHelper.attachToRecyclerView(binding.recycler)
    }

    companion object {
        const val TAG = "ItemTouchHelperFragment TAG"
    }
}
