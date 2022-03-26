package com.uca.edu.ni.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uca.edu.ni.peliculas.adapter.ClasificacionAdapter.ClasificacionViewHolder
import com.uca.edu.ni.peliculas.databinding.ItemBinding
import com.uca.edu.ni.peliculas.models.Clasificacion

class ClasificacionAdapter(private val datos: List<Clasificacion>) :
    RecyclerView.Adapter<ClasificacionViewHolder>() {

    inner class ClasificacionViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(clasificacion: Clasificacion): Unit = with(binding) {
            txtTitulo.text = clasificacion.abreviacion
            txtDescripcion.text = clasificacion.nombre
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClasificacionViewHolder {
        val clasificacionBinding = ItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ClasificacionViewHolder(clasificacionBinding)
    }

    override fun onBindViewHolder(holder: ClasificacionViewHolder, position: Int) =
        holder.bind(datos[position])

    override fun getItemCount(): Int = datos.size
}