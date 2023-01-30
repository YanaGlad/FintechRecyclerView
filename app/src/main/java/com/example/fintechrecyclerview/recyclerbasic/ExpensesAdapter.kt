package com.example.fintechrecyclerview.recyclerbasic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fintechrecyclerview.Categories
import com.example.fintechrecyclerview.R
import com.example.fintechrecyclerview.databinding.ExpenseItemBinding
import com.example.fintechrecyclerview.model.ExpenseModel

/**
 * @author y.gladkikh
 */
class ExpensesAdapter(private val expenses: List<ExpenseModel>) :
    RecyclerView.Adapter<ExpensesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(ExpenseItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(expenses[position])

    override fun getItemCount(): Int = expenses.size

    class ViewHolder(_binding: ExpenseItemBinding) : RecyclerView.ViewHolder(_binding.root) {

        var binding: ExpenseItemBinding = ExpenseItemBinding.bind(itemView)

        fun bind(model: ExpenseModel) {
            binding.title.text = model.title
            binding.subtitle.text = model.subtitle
            binding.price.text = "${model.price} $"

            val imageRes = when (model.subtitle) {
                Categories.AVIA.title -> R.drawable.ic_avia
                Categories.CLOTHING.title -> R.drawable.ic_clothing
                Categories.EDUCATION.title -> R.drawable.ic_education
                Categories.HOUSE.title -> R.drawable.ic_house
                Categories.PETS.title -> R.drawable.ic_pets
                Categories.ENTERTAINMENT.title -> R.drawable.ic_entertainment
                Categories.RESTAURANTS.title -> R.drawable.ic_restaurants
                Categories.SUPERMARKETS.title -> R.drawable.ic_supermarket
                else -> R.drawable.ic_else
            }
            binding.iconImage.setImageResource(imageRes)
        }
    }
}
