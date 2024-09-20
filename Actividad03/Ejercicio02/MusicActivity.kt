package com.example.musicplayer

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private lateinit var btnSeleccionar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinnerAudios)
        btnSeleccionar = findViewById(R.id.btnSeleccionar)

        // Lista de audios
        val audios = arrayOf("Audio 1", "Audio 2", "Audio 3", "Audio 4", "Audio 5")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, audios)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Al seleccionar un audio, pasar a la siguiente actividad con la información del audio
        btnSeleccionar.setOnClickListener {
            val selectedAudio = spinner.selectedItem.toString()
            val intent = Intent(this, PlayerActivity::class.java)
            intent.putExtra("selectedAudio", selectedAudio)
            startActivity(intent)
        }
    }
}
