package com.tunombre.finalm4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaActivity : AppCompatActivity() {

    private val generos = listOf("Rock", "Pop", "Reggaetón", "Electrónica")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val recycler = findViewById<RecyclerView>(R.id.recyclerGeneros)
        val btnContacto = findViewById<Button>(R.id.btnContacto)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = GeneroAdapter(generos) { generoSeleccionado ->
            val intent = Intent(this, DetalleActivity::class.java)
            intent.putExtra("genero", generoSeleccionado)
            startActivity(intent)
        }

        btnContacto.setOnClickListener {
            startActivity(Intent(this, ContactoActivity::class.java))
        }
    }
}