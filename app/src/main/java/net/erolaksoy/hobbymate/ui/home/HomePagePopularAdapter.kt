package net.erolaksoy.hobbymate.ui.home

import android.graphics.ColorFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import net.erolaksoy.hobbymate.databinding.PopularlistItemBinding
import java.util.*

class HomePagePopularAdapter(var list: ArrayList<String>) :
    RecyclerView.Adapter<HomePageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePageViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = PopularlistItemBinding.inflate(layoutInflater)
        return HomePageViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: HomePageViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class HomePageViewHolder(private val binding: PopularlistItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    //val imgview = binding.heartIcon
    fun bind(item: String) {
     //   binding.contentText.text = item
    }
}