package com.uca.edu.ni.peliculas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uca.edu.ni.peliculas.databinding.FragmentPeliculaBinding

class PeliculaFragment : Fragment() {
    private lateinit var binding : FragmentPeliculaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPeliculaBinding.inflate(inflater, container, false)
        return binding.root
    }

}