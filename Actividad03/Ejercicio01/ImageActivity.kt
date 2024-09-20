package com.example.imageviewer.Ejercicio1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ImageActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var btnVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        imageView = findViewById(R.id.imageView)
        btnVolver = findViewById(R.id.btnVolver)

        // Obtener la imagen seleccionada desde la MainActivity
        val selectedImage = intent.getStringExtra("selectedImage")

        // Mostrar la imagen según la selección (esto es un ejemplo, se debería mapear a imágenes reales)
        when (selectedImage) {
            "Imagen 1" -> imageView.setImageResource(R.drawable.image1)
            "Imagen 2" -> imageView.setImageResource(R.drawable.image2)
            "Imagen 3" -> imageView.setImageResource(R.drawable.image3)
            "Imagen 4" -> imageView.setImageResource(R.drawable.image4)
            "Imagen 5" -> imageView.setImageResource(R.drawable.image5)
        }

        // Al hacer clic en volver, regresa a la actividad anterior
        btnVolver.setOnClickListener {
            finish()
        }
    }
}
