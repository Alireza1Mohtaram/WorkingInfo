package com.alireza.claculatework.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.alireza.claculatework.R
import com.alireza.claculatework.data.model.Season

class SeasonAdapter(
    private var onItemClicked: ((season: Season) -> Unit)
) : ListAdapter<Season, SeasonAdapter.SeasonViewHolderClass>(object :
    DiffUtil.ItemCallback<Season?>() {
    override fun areItemsTheSame(oldItem: Season, newItem: Season): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Season, newItem: Season): Boolean {
        return oldItem == newItem
    }
}) {
    inner class SeasonViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.season_text)

        fun bind(season: Season) {
            textView.text = season.name
            textView.setOnClickListener {
                onItemClicked(season)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeasonViewHolderClass {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.season_item_layout, parent, false)
        return SeasonViewHolderClass(view)
    }

    override fun onBindViewHolder(holder: SeasonViewHolderClass, position: Int) {
        holder.bind(getItem(position))
    }

}