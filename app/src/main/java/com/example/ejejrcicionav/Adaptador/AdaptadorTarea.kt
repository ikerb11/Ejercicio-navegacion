package com.example.ejejrcicionav.Adaptador

import android.annotation.SuppressLint
import android.content.Context
import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import com.example.ejejrcicionav.R
import com.example.ejejrcicionav.Tarea

class AdaptadorTarea (private var tareas: ArrayList<Tarea>,var context: Context) : ListAdapter {
    private val dataSetObservers = mutableListOf<DataSetObserver>()

    override fun registerDataSetObserver(observer: DataSetObserver?) {
        if (observer != null) {
            dataSetObservers.add(observer)
        }
    }
    override fun unregisterDataSetObserver(observer: DataSetObserver?) {
        if (observer != null) {
            dataSetObservers.remove(observer)
        }
    }
    override fun getCount(): Int {
        return tareas.size
    }
    override fun getItem(i: Int): Any {
        return tareas[i]
    }
    override fun getItemId(i: Int): Long {
        return i.toLong()
    }
    override fun hasStableIds(): Boolean {
        return true;
    }

    @SuppressLint("InflateParams")
    override fun getView(i: Int, view: View?, viewGroup: ViewGroup?): View? {
        var vista = view
        if (vista == null) {
            val inflater = LayoutInflater.from(context)
            vista = inflater.inflate(R.layout.fragment_tarea_detalle, null)
        }
        val titulo = vista!!.findViewById<View>(R.id.titulo) as TextView
        titulo.setText(tareas.get(i).titulo)
        val descripcion = vista.findViewById<View>(R.id.descripcion) as TextView
        descripcion.setText(tareas.get(i).descripcion)
        return vista
    }

    override fun getItemViewType(position: Int): Int {
        return 0
    }
    override fun getViewTypeCount(): Int {
        return 1
    }
    override fun isEmpty(): Boolean {
        return tareas.isEmpty()
    }
    override fun areAllItemsEnabled(): Boolean {
        return true
    }
    override fun isEnabled(position: Int): Boolean {
        return true
    }
}