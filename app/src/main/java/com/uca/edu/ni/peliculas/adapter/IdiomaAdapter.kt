package com.uca.edu.ni.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uca.edu.ni.peliculas.adapter.IdiomaAdapter.IdiomaViewHolder
import com.uca.edu.ni.peliculas.databinding.ItemBinding
import com.uca.edu.ni.peliculas.models.Idioma

class IdiomaAdapter(private val datos: List<Idioma>) : RecyclerView.Adapter<IdiomaViewHolder>() {

    inner class IdiomaViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(idioma : Idioma): Unit = with(binding){
            txtTitulo.text = idioma.id.toString()
            txtDescripcion.text = idioma.nombre
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IdiomaViewHolder {
        val idiomaBinding = ItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return IdiomaViewHolder(idiomaBinding)
    }

    override fun onBindViewHolder(holder: IdiomaViewHolder, position: Int) =
        holder.bind(datos[position])

    override fun getItemCount(): Int =  datos.size

}