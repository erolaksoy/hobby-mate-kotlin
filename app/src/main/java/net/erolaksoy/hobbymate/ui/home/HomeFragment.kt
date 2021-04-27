package net.erolaksoy.hobbymate.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import net.erolaksoy.hobbymate.databinding.FragmentHomeBinding
import java.util.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val list: ArrayList<String> = arrayListOf(
            "Lorem Ipsum",
            "has been",
            "the industry's",
            "standard dummy text",
            "ever since the 1500s",
            "when an unknown printer",
            "took a galley",
            "of type and scrambled"
        )
        binding.popularRecyclerView.adapter = HomePagePopularAdapter(list)
        binding.recommendedRecyclerView.layoutManager =
            GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        binding.recommendedRecyclerView.adapter = HomePageRecommendedAdapter(list)
        return binding.root
    }


}

