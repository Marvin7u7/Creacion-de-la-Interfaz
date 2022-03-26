package com.uca.edu.ni.peliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uca.edu.ni.peliculas.databinding.ItemPeliculaBinding
import com.uca.edu.ni.peliculas.models.Pelicula

class PeliculaAdapter(private val datos : List<Pelicula>) :
    RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder>() {

    inner class PeliculaViewHolder(private val binding: ItemPeliculaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(pelicula: Pelicula) = with(binding) {
            txtTitulo.text = pelicula.titulo
            txtDescripcion.text = pelicula.sinopsis
            txtTipoMetraje.text = pelicula.tipoMetraje
            txtDuracion.text = pelicula.duracion
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val peliculaBinding = ItemPeliculaBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return PeliculaViewHolder(peliculaBinding)
    }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) =
        holder.bind(datos[position])

    override fun getItemCount(): Int = datos.size
}