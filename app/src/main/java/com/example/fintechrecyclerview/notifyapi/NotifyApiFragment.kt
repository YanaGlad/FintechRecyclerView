package com.example.fintechrecyclerview.notifyapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fintechrecyclerview.databinding.FragmentNotifyApiBinding
import com.example.fintechrecyclerview.model.ExpenseModel
import com.example.fintechrecyclerview.recyclerbasic.ExpensesAdapter

/**
 * @author y.gladkikh
 */
class NotifyApiFragment : Fragment() {

    private var _binding: FragmentNotifyApiBinding? = null
    private val binding get() = _binding!!

    private val stubExpenseList: MutableList<ExpenseModel> = mutableListOf(
        ExpenseModel(
            title = "H&M",
            subtitle = "Одежда",
            price = 20,
        ),
        ExpenseModel(
            title = "Лента",
            subtitle = "Супермаркеты",
            price = 20,
        ),
        ExpenseModel(
            title = "Аэрофлот",
            subtitle = "Авиабилеты",
            price = 120,
        ),
        ExpenseModel(
            title = "Stepik",
            subtitle = "Образование",
            price = 10,
        ),
        ExpenseModel(
            title = "Подписка Telegram",
            subtitle = "Другое",
            price = 5,
        ),
        ExpenseModel(
            title = "Леруа",
            subtitle = "Дом",
            price = 100,
        ),
        ExpenseModel(
            title = "New Balance",
            subtitle = "Одежда",
            price = 200,
        ),
        ExpenseModel(
            title = "Окей",
            subtitle = "Супермаркеты",
            price = 1000,
        ),
        ExpenseModel(
            title = "Победа",
            subtitle = "Авиабилеты",
            price = 50,
        ),
        ExpenseModel(
            title = "Coursera",
            subtitle = "Образование",
            price = 100,
        ),
        ExpenseModel(
            title = "Перекресток",
            subtitle = "Супермаркеты",
            price = 100,
        ),
        ExpenseModel(
            title = "Вкусно и Точка!",
            subtitle = "Рестораны",
            price = 100,
        ),
    )

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
