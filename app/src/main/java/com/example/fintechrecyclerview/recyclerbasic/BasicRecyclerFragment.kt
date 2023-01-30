package com.example.fintechrecyclerview.recyclerbasic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fintechrecyclerview.databinding.FragmentBasicRecyclerBinding
import com.example.fintechrecyclerview.stubExpenseList

/**
 * @author y.gladkikh
 */
class BasicRecyclerFragment : Fragment() {

    // assign the _binding variable initially to null and
    // also when the view is destroyed again it has to be set to null
    private var _binding: FragmentBasicRecyclerBinding? = null

    // with the backing property of the kotlin we extract
    // the non null value of the _binding
    private val binding get() = _binding!!

    private lateinit var expensesAdapter: ExpensesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasicRecyclerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        expensesAdapter = ExpensesAdapter(stubExpenseList)

        binding.recycler.adapter = expensesAdapter
    }

    companion object {
        const val TAG = "BasicRecyclerFragment TAG"
    }
}
