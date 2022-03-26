package com.uca.edu.ni.peliculas.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Clasificacion(
    @SerializedName(value = "idClasificacion")
    val id: Int,
    @SerializedName(value = "abreviacion")
    val abreviacion: String,
    @SerializedName(value = "nombre")
    val nombre: String,
    @SerializedName(value = "activo")
    val activo: Boolean
) : Serializable