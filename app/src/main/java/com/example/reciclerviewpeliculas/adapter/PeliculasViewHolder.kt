package com.example.reciclerviewpeliculas.adapter

import android.view.View
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewpeliculas.Peliculas
import com.example.reciclerviewpeliculas.R
import com.example.reciclerviewpeliculas.databinding.ItemPeliculasBinding
import com.google.android.material.snackbar.Snackbar


class PeliculasViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val b = ItemPeliculasBinding.bind(view)
    fun render(PelisModel: Peliculas){
        b.tvTitulo.text = PelisModel.titulo
        b.tvDirector.text = PelisModel.director
        b.tvAO.text = PelisModel.año
        Glide.with(b.ivPelicula.context)
            .load(PelisModel.photo)
            .error(R.drawable.ic_launcher_foreground)
            .into(b.ivPelicula)

        b.ivPelicula.setOnClickListener {
            Toast.makeText(b.ivPelicula.context, PelisModel.titulo, Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Snackbar.make(b.ivPelicula, PelisModel.año, Snackbar.LENGTH_SHORT).show()
        }
    }
}