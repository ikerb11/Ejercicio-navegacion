package com.example.ejejrcicionav.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

import com.example.ejejrcicionav.R


class TareaDetalleFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista= inflater.inflate(R.layout.fragment_tarea_detalle, container, false)

        // Obtener los argumentos
        val arguments = arguments
        if (arguments != null) {
            // Obtener el valor pasado como argumento
            val aTitulo = arguments.getString("titulo")
            val aDescripcion = arguments.getString("descripcion")


            // Hacer algo con el valor, por ejemplo, mostrarlo en un TextView
            val titulo = vista.findViewById<TextView>(R.id.titulo)
            titulo.text = aTitulo
            val descripcion= vista.findViewById<TextView>(R.id.descripcion)
            descripcion.text = aDescripcion

        }
        return vista
    }
}