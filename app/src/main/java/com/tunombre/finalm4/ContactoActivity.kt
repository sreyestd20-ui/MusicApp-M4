package com.tunombre.finalm4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContactoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString()
            Toast.makeText(this, "Gracias por tu comentario $nombre", Toast.LENGTH_SHORT).show()
        }
    }
}