package com.example.fintechrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fintechrecyclerview.databinding.ActivityMainBinding
import com.example.fintechrecyclerview.model.ExpenseModel
import com.example.fintechrecyclerview.recycler.ExpensesAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
