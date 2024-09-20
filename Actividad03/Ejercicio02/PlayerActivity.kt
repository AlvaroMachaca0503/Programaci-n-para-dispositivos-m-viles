package com.example.musicplayer

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PlayerActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var btnPlay: Button
    private lateinit var btnPause: Button
    private lateinit var btnStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val audioName = intent.getStringExtra("selectedAudio")
        val audioTitle: TextView = findViewById(R.id.audioTitle)
        val audioImage: ImageView = findViewById(R.id.audioImage)

        btnPlay = findViewById(R.id.btnPlay)
        btnPause = findViewById(R.id.btnPause)
        btnStop = findViewById(R.id.btnStop)

        audioTitle.text = audioName
        audioImage.setImageResource(R.drawable.audio_icon) // Ejemplo

        // Mapear el audio seleccionado al archivo de res/raw
        when (audioName) {
            "Audio 1" -> mediaPlayer = MediaPlayer.create(this, R.raw.audio1)
            "Audio 2" -> mediaPlayer = MediaPlayer.create(this, R.raw.audio2)
            "Audio 3" -> mediaPlayer = MediaPlayer.create(this, R.raw.audio3)
            "Audio 4" -> mediaPlayer = MediaPlayer.create(this, R.raw.audio4)
            "Audio 5" -> mediaPlayer = MediaPlayer.create(this, R.raw.audio5)
        }

        // Implementar botones de reproducción
        btnPlay.setOnClickListener {
            mediaPlayer.start()
        }

        btnPause.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            }
        }

        btnStop.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.prepare()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()  // Liberar el recurso al destruir la actividad
    }
}


