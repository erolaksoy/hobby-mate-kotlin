package net.erolaksoy.hobbymate.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.erolaksoy.hobbymate.databinding.PopularRecyclerCarditemBinding

class HomePageListAdapter(var list: ArrayList<String>) :
    RecyclerView.Adapter<HomePageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomePageViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding  = PopularRecyclerCarditemBinding.inflate(layoutInflater)
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
class HomePageViewHolder(private val binding: PopularRecyclerCarditemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.contentText.text = item
    }
}