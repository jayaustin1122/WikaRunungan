package com.example.wika_runungan.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wika_runungan.data.Noli
import com.example.wika_runungan.databinding.NoliRowItemBinding

class NoliAdapter(var lists: MutableList<Noli>): RecyclerView.Adapter<NoliAdapter.NoliViewHolder>()   {

    var onItemClick : ((Noli)-> Unit)? = null
    inner class NoliViewHolder (val binding: NoliRowItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoliViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = NoliRowItemBinding.inflate(layoutInflater,parent,false)
        return NoliViewHolder(binding)
    }
    fun onApplySearch(list: MutableList<Noli>){
        this.lists=list
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: NoliViewHolder, position: Int) {
        holder.binding.apply {
            imgCover.setImageResource(lists[position].Image)
            title.text = lists[position].title

        }
        // to make the viewcard functional
        holder.itemView.setOnClickListener(){
            onItemClick?.invoke(lists[position])
        }
    }
}
