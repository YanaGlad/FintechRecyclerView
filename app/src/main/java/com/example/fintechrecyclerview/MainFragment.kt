package com.example.fintechrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fintechrecyclerview.databinding.FragmentMainBinding
import com.example.fintechrecyclerview.itemtouchhelper.ItemTouchHelperFragment
import com.example.fintechrecyclerview.listadapter.ListAdapterFragment
import com.example.fintechrecyclerview.recyclerbasic.BasicRecyclerFragment
import com.example.fintechrecyclerview.notifyapi.NotifyApiFragment

/**
 * @author y.gladkikh
 */
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerviewAdapter.setOnClickListener {
            navigateToFragment(BasicRecyclerFragment(), BasicRecyclerFragment.TAG)
        }
        binding.recyclerNotifyApi.setOnClickListener {
            navigateToFragment(NotifyApiFragment(), NotifyApiFragment.TAG)
        }
        binding.listviewAdapter.setOnClickListener {
            navigateToFragment(ListAdapterFragment(), ListAdapterFragment.TAG)
        }
        binding.itemTouchHelper.setOnClickListener {
            navigateToFragment(ItemTouchHelperFragment(), ItemTouchHelperFragment.TAG)
        }
    }

    private fun navigateToFragment(fragment: Fragment, tag: String) {
        parentFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.nav_host_fragment, fragment, tag)
            .addToBackStack(null)
            .commit()
    }
}
