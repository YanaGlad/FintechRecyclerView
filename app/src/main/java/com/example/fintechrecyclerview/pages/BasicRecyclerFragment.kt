package com.example.fintechrecyclerview.pages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fintechrecyclerview.R
import com.example.fintechrecyclerview.databinding.FragmentBasicRecyclerBinding
import com.example.fintechrecyclerview.model.ExpenseModel
import com.example.fintechrecyclerview.recycler.ExpensesAdapter

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

    private val stubExpenseList: List<ExpenseModel> = listOf(
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
}
