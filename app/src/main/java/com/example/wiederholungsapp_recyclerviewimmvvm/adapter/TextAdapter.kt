package com.example.wiederholungsapp_recyclerviewimmvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wiederholungsapp_recyclerviewimmvvm.MainViewModel
import com.example.wiederholungsapp_recyclerviewimmvvm.data.datamodels.Text
import com.example.wiederholungsapp_recyclerviewimmvvm.databinding.TextItemBinding

//class for our adapter
class TextAdapter (
    //variable for our data
    private val dataset: List<Text>,
    //variable for viewModel
    private val viewModel: MainViewModel
        ) : RecyclerView.Adapter<TextAdapter.ItemViewHolder>() {

            //class for our itemviewholder objects
            class ItemViewHolder(val binding: TextItemBinding) : RecyclerView.ViewHolder(binding.root)

    //builds our layout for the itemviewholder objects
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = TextItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    //returns the length of our list
    override fun getItemCount(): Int {
        return dataset.size
    }

    //manipulate the behavior of every itemviewholder object
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //we get the texts at their position in the recyclerview
        val text = dataset[position]

        //sets text to the text at the position in our list
        holder.binding.tvText.text = text.text
    }

}