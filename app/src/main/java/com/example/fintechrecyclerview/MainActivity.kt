package com.example.fintechrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fintechrecyclerview.databinding.ActivityMainBinding
import com.example.fintechrecyclerview.model.ExpenseModel
import com.example.fintechrecyclerview.recycler.ExpensesAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        expensesAdapter = ExpensesAdapter(stubExpenseList)

        binding.recycler.adapter = expensesAdapter
    }
}
