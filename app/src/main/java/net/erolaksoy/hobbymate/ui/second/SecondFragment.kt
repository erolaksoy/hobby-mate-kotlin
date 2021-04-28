package net.erolaksoy.hobbymate.ui.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.erolaksoy.hobbymate.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.toolbar.backButtonIcon.setOnClickListener { requireActivity().supportFragmentManager.popBackStack() }
        return binding.root
    }

}