package com.tunombre.finalm4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GeneroAdapter(
    private val lista: List<String>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<GeneroAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvGenero: TextView = view.findViewById(R.id.tvGenero)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_genero, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = lista.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val genero = lista[position]
        holder.tvGenero.text = genero
        holder.itemView.setOnClickListener {
            onClick(genero)
        }
    }
}