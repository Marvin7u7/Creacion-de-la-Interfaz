package com.uca.edu.ni.peliculas.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Genero(
    @SerializedName(value = "idGenero")
    val id: Int,
    @SerializedName(value = "nombre")
    val nombre: String,
    @SerializedName(value = "activo")
    val activo: Boolean
) : Serializable