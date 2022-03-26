package com.uca.edu.ni.peliculas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.uca.edu.ni.peliculas.R
import com.uca.edu.ni.peliculas.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private lateinit var binding : FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMenuBinding.inflate(inflater, container, false)

        binding.buttonClasificacion.setOnClickListener {
            findNavController().navigate(R.id.irClasificacion)
        }

        binding.buttonGenero.setOnClickListener {
            findNavController().navigate(R.id.irGenero)
        }

        binding.buttonIdioma.setOnClickListener {
            findNavController().navigate(R.id.irIdioma)
        }

        binding.buttonNacionalidad.setOnClickListener {
            findNavController().navigate(R.id.irNacionalidad)
        }

        binding.buttonPelicula.setOnClickListener {
            findNavController().navigate(R.id.irPelicula)
        }

        return binding.root
    }


}