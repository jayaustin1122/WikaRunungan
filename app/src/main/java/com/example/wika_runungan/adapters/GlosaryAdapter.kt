package com.example.wika_runungan.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.wika_runungan.data.Glosary
import com.example.wika_runungan.databinding.GlosaryItemRowBinding

class GlosaryAdapter (private val context: Context, private val data: ArrayList<Glosary>,private val onItemClickListener: (Int) -> Unit):
    RecyclerView.Adapter<GlosaryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = GlosaryItemRowBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            title.text = data[position].title
            desc.text = data[position].description
        }
        // to make the viewcard functional
        holder.itemView.setOnClickListener(){
            onItemClickListener(position)

        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(val binding: GlosaryItemRowBinding) :
        RecyclerView.ViewHolder(binding.root)
}