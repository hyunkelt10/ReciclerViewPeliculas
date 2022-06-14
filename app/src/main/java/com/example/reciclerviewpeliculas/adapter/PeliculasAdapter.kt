package com.example.reciclerviewpeliculas.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewpeliculas.Peliculas
import com.example.reciclerviewpeliculas.R




class PeliculasAdapter(private val peliculasList: List<Peliculas>) : RecyclerView.Adapter<PeliculasViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder {
        // En vez de tener que recojer el contexto como parámetro lo puedo
        // coger de cualquiera de las vistas del layout
        val layoutInflater = LayoutInflater.from(parent.context)
        return PeliculasViewHolder(layoutInflater.inflate(R.layout.item_peliculas, parent, false))
    }
    //Va a pasar por cada uno de lo item y va a llamar a la función render()
    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
        val item = peliculasList[position]
        holder.render(item)
    }

    //Devuelve el tamaño de la lista
    override fun getItemCount(): Int = peliculasList.size
}