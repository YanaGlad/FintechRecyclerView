package com.example.fintechrecyclerview.delegates

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fintechrecyclerview.databinding.FragmentDelegatesBinding

/**
 * @author y.gladkikh
 */
class DelegatesFragment : Fragment() {

    private var _binding: FragmentDelegatesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDelegatesBinding.inflate(inflater, container, false)
        return binding.root
    }
}
