package com.uca.edu.ni.peliculas.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Pelicula(
    @SerializedName(value = "idPelicula")
     val id: Int,
    @SerializedName(value = "titulo")
     val titulo: String,
    @SerializedName(value = "idNacionalidad")
     val idNacionalidad: Int,
    @SerializedName(value = "idClasificacion")
     val idClasificacion: Int,
    @SerializedName(value = "tipoMetraje")
     val tipoMetraje: String,
    @SerializedName(value = "duracion")
     val duracion: String,
    @SerializedName(value = "sinopsis")
     val sinopsis: String
) : Serializable