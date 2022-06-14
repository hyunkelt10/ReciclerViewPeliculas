package com.example.reciclerviewpeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reciclerviewpeliculas.adapter.PeliculasAdapter
import com.example.reciclerviewpeliculas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        initRecyclerView()

    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //Coloca cada item en una rejilla
        //val manager = GridLayoutManager(this, 2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        b.recyclerPeliculas.layoutManager = manager
        b.recyclerPeliculas.addItemDecoration(decoration)
        b.recyclerPeliculas.layoutManager = LinearLayoutManager(this)
        b.recyclerPeliculas.adapter = PeliculasAdapter(PeliculasProvider.peliculasLista)

    }
}