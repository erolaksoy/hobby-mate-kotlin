package net.erolaksoy.hobbymate.ui.home

import android.os.Bundle
import android.view.*
import android.widget.ImageView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import net.erolaksoy.hobbymate.R
import net.erolaksoy.hobbymate.databinding.FragmentHomeBinding

import java.util.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setHasOptionsMenu(true)
        val binding: FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val act = activity as AppCompatActivity

        val toolbar = view?.findViewById<Toolbar>(R.id.toolbar)
        toolbar?.setNavigationIcon(R.drawable.menu_ico)
        toolbar?.inflateMenu(R.menu.bottom_menu)
        act.setSupportActionBar(toolbar)


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

//        binding.apply {
//            toolbar.menuIcon.setOnClickListener {
//                Toast.makeText(requireContext(), "This is a menu icon", Toast.LENGTH_SHORT).show()
//            }
//            toolbar.userIcon.setOnClickListener {
//                Toast.makeText(requireContext(), "This is a user icon", Toast.LENGTH_SHORT).show()
//            }
//        }

        binding.recommendedRecyclerView.layoutManager =
            GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        binding.recommendedRecyclerView.adapter = HomePageRecommendedAdapter(list)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        activity?.menuInflater?.inflate(R.menu.bottom_menu,menu)

    }

}

