package com.example.ejejrcicionav.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.ejejrcicionav.Adaptador.AdaptadorTarea
import com.example.ejejrcicionav.R
import com.example.ejejrcicionav.Tarea


class AgregarTareaFragment : Fragment() {
    lateinit var boton:Button
    lateinit var vista : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_agregar_tarea, container, false)
        boton= vista.findViewById(R.id.button3)
        return vista;
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        boton.setOnClickListener() {
            val titulo = vista.findViewById<EditText?>(R.id.editTitulo).text.toString()
            val descripcion = vista.findViewById<EditText?>(R.id.editDescripcion).text.toString()
            Tarea.getValue().add(Tarea(titulo,descripcion))
            vista.findNavController().navigate(R.id.action_agregarTareaFragment_to_tareaListaFragment, )
        }



    }


}