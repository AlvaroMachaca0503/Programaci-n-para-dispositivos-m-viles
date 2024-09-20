package com.example.imageviewer.Ejercicio1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private lateinit var btnSiguiente: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializamos el spinner y el botón
        spinner = findViewById(R.id.spinnerImages)
        btnSiguiente = findViewById(R.id.btnSiguiente)

        // Creamos una lista de nombres de imágenes
        val images = arrayOf("Imagen 1", "Imagen 2", "Imagen 3", "Imagen 4", "Imagen 5")

        // Configuramos el adaptador para el spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, images)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Al hacer clic en el botón siguiente, se pasa la imagen seleccionada a la segunda actividad
        btnSiguiente.setOnClickListener {
            val selectedImage = spinner.selectedItem.toString()
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("selectedImage", selectedImage)
            startActivity(intent)
        }
    }
}
