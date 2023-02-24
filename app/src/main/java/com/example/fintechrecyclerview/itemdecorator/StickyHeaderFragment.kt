package com.example.fintechrecyclerview.itemdecorator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fintechrecyclerview.databinding.FragmentStickyHeaderBinding
import com.example.fintechrecyclerview.delegates.date.DateDelegate
import com.example.fintechrecyclerview.delegates.date.DateModel
import com.example.fintechrecyclerview.delegates.expense.ExpenseDelegate
import com.example.fintechrecyclerview.delegates.expense.ExpenseModel
import com.example.fintechrecyclerview.delegates.utils.MainAdapter
import com.example.fintechrecyclerview.delegates.utils.concatenateWithDate

class StickyHeaderFragment : Fragment() {

    private var _binding: FragmentStickyHeaderBinding? = null
    private val binding get() = _binding!!

    private val adapter: MainAdapter by lazy { MainAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStickyHeaderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter.apply {
            addDelegate(ExpenseDelegate())
            addDelegate(DateDelegate())
        }

        binding.recycler.apply {
            addItemDecoration(StickyHeaderItemDecoration())
            this.adapter = adapter
        }
        adapter.submitList(stubExpenseList.concatenateWithDate(stubDatesList))
    }

    companion object {

        const val TAG = "StickyHeaderFragment TAG"

        private const val JUL_5 = "5 июля"
        private const val SEP_1 = "1 сенятбря"
        private const val SEP_12 = "12 сенятбря"
        private const val DEC_7 = "7 декабря"

        private val stubDatesList = listOf(
            DateModel(
                id = 1,
                date = SEP_1,
            ),
            DateModel(
                id = 2,
                date = SEP_12,
            ),
            DateModel(
                id = 3,
                date = JUL_5,
            ),
            DateModel(
                id = 4,
                date = DEC_7,
            ),
        )

        private val stubExpenseList = listOf(
            ExpenseModel(
                id = 1,
                title = "H&M",
                subtitle = "Одежда",
                price = 20,
                date = DEC_7,
            ),
            ExpenseModel(
                id = 2,
                title = "Лента",
                subtitle = "Супермаркеты",
                price = 20,
                date = SEP_1,
            ),
            ExpenseModel(
                id = 3,
                title = "Аэрофлот",
                subtitle = "Авиабилеты",
                price = 120,
                date = JUL_5,
            ),
            ExpenseModel(
                id = 4,
                title = "Stepik",
                subtitle = "Образование",
                price = 10,
                date = SEP_12,
            ),
            ExpenseModel(
                id = 5,
                title = "Подписка Telegram",
                subtitle = "Другое",
                price = 5,
                date = JUL_5,
            ),
            ExpenseModel(
                id = 6,
                title = "Леруа",
                subtitle = "Дом",
                price = 100,
                date = DEC_7,
            ),
            ExpenseModel(
                id = 7,
                title = "New Balance",
                subtitle = "Одежда",
                price = 200,
                date = JUL_5,
            ),
            ExpenseModel(
                id = 8,
                title = "Окей",
                subtitle = "Супермаркеты",
                price = 1000,
                date = JUL_5,
            ),
            ExpenseModel(
                id = 9,
                title = "Победа",
                subtitle = "Авиабилеты",
                price = 50,
                date = SEP_12,
            ),
            ExpenseModel(
                id = 10,
                title = "Coursera",
                subtitle = "Образование",
                price = 100,
                date = JUL_5,
            ),
            ExpenseModel(
                id = 11,
                title = "Перекресток",
                subtitle = "Супермаркеты",
                price = 100,
                date = SEP_12,
            ),
            ExpenseModel(
                id = 12,
                title = "Вкусно и Точка!",
                subtitle = "Рестораны",
                price = 100,
                date = SEP_12,
            ),
        )
    }
}
