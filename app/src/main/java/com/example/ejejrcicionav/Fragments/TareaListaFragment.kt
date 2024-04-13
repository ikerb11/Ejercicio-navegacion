package com.example.ejejrcicionav.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.ejejrcicionav.Adaptador.AdaptadorTarea
import com.example.ejejrcicionav.R
import com.example.ejejrcicionav.Tarea

class TareaListaFragment : Fragment() {
    lateinit var  lista: ListView
    var tareas: ArrayList<Tarea> = ArrayList()
    lateinit var vista : View;
    lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_tarea_lista, container, false)
        lista= vista.findViewById(R.id.lista)
        boton= vista.findViewById(R.id.button2)



        return vista;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tareas = Tarea.getValue()
        lista.adapter=AdaptadorTarea(tareas, requireContext())
        boton.setOnClickListener{
            Tarea.setValue(tareas)
            vista.findNavController().navigate(R.id.action_tareaListaFragment_to_agregarTareaFragment)
        }
        lista.setOnItemClickListener {_, _, i, _ ->
            val bundle = Bundle()
            bundle.putString("titulo", tareas.get(i).titulo)
            bundle.putString("descripcion", tareas.get(i).descripcion)
            vista.findNavController().navigate(R.id.action_tareaListaFragment_to_tareaDetalleFragment, bundle)
        }
    }
}

