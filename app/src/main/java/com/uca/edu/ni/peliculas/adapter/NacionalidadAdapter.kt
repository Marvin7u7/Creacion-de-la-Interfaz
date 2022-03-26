package com.uca.edu.ni.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uca.edu.ni.peliculas.adapter.NacionalidadAdapter.NacionalidadViewHolder
import com.uca.edu.ni.peliculas.databinding.ItemBinding
import com.uca.edu.ni.peliculas.models.Nacionalidad

class NacionalidadAdapter(private val datos: List<Nacionalidad>) :
    RecyclerView.Adapter<NacionalidadViewHolder>() {

    inner class NacionalidadViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(nacionalidad: Nacionalidad): Unit = with(binding) {
            txtTitulo.text = nacionalidad.id.toString()
            txtDescripcion.text = nacionalidad.nombre
        }

    }


    override fun getItemCount(): Int = datos.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NacionalidadViewHolder {
        val nacionalidadBinding = ItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return NacionalidadViewHolder(nacionalidadBinding)
    }

    override fun onBindViewHolder(holder: NacionalidadViewHolder, position: Int) =
        holder.bind(datos[position])
}