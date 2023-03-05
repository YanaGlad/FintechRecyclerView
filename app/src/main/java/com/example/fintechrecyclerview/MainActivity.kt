package com.example.fintechrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fintechrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, MainFragment(), MainFragment.TAG)
                .addToBackStack(null)
                .commit()
        }
    }
}
