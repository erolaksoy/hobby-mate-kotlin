package net.erolaksoy.hobbymate.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.erolaksoy.hobbymate.databinding.RecommendedRecyclerCarditemBinding

class HomePageRecommendedAdapter(val list : ArrayList<String>) : RecyclerView.Adapter<RecommendedViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommendedViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemBinding = RecommendedRecyclerCarditemBinding.inflate(inflater)
        return RecommendedViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: RecommendedViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
class RecommendedViewHolder(val binding : RecommendedRecyclerCarditemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item : String){
        binding.contentText.text = item
    }
}