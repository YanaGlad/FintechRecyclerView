package com.example.fintechrecyclerview.notifyapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fintechrecyclerview.databinding.FragmentNotifyApiBinding
import com.example.fintechrecyclerview.stubExpenseList

/**
 * @author y.gladkikh
 */
class NotifyApiFragment : Fragment() {

    private var _binding: FragmentNotifyApiBinding? = null
    private val binding get() = _binding!!

    private lateinit var expensesNotifyAdapter: ExpensesNotifyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotifyApiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        expensesNotifyAdapter = ExpensesNotifyAdapter(stubExpenseList)

        binding.recycler.adapter = expensesNotifyAdapter
    }

    companion object {
        const val TAG = "NotifyApiFragment TAG"
    }
}
