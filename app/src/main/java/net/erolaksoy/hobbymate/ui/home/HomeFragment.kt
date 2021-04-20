package net.erolaksoy.hobbymate.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import net.erolaksoy.hobbymate.R
import net.erolaksoy.hobbymate.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.popularRecyclerView.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        val list = arrayListOf<String>("Erol Aksoy","Selin Güçlü","Ahmet Safa Kazan","Safa Kaan Kefeli", "Oğuzhan Yamak","Muhammed Demez","Mesut Erdal","Fatih Aydik")
        binding.popularRecyclerView.adapter = HomePageListAdapter(list)
        return binding.root
    }
}

