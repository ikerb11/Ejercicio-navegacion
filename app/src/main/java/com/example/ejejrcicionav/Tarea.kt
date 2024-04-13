package com.example.ejejrcicionav

class Tarea(var titulo: String, var descripcion: String) {
    companion object{
        var  lista: ArrayList<Tarea> = arrayListOf(
                Tarea("Tarea1", "Descripcion para la tarea 1"),
                Tarea("Tarea2", "Descripcion para la tarea 2"),
                Tarea("Tarea3", "Descripcion para la tarea 3"),
                Tarea("Tarea4", "Descripcion para la tarea 4"),
                Tarea("Tarea5", "Descripcion para la tarea 5"),
                Tarea("Tarea6", "Descripcion para la tarea 6"),
                Tarea("Tarea7", "Descripcion para la tarea 7"),
                Tarea("Tarea8", "Descripcion para la tarea 8"))

        fun  getValue(): ArrayList<Tarea>{
            return lista
        }
        fun  setValue( tareas: ArrayList<Tarea>){
            lista=tareas
        }
    }

}