package com.uca.edu.ni.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uca.edu.ni.peliculas.adapter.GeneroAdapter.GeneroViewHolder
import com.uca.edu.ni.peliculas.databinding.ItemBinding
import com.uca.edu.ni.peliculas.models.Genero

class GeneroAdapter(private val datos: List<Genero>) : RecyclerView.Adapter<GeneroViewHolder>() {

    inner class GeneroViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(genero: Genero): Unit = with(binding) {
            txtTitulo.text = genero.id.toString()
            txtDescripcion.text = genero.nombre
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneroViewHolder {
        val generoBinding = ItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return GeneroViewHolder(generoBinding)
    }

    override fun onBindViewHolder(holder: GeneroViewHolder, position: Int) =
        holder.bind(datos[position])

    override fun getItemCount(): Int = datos.size

}