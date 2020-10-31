package com.example.percakapanbahasaarab

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_isi_percakapan.*

class IsiPercakapan : AppCompatActivity() {

    private var mp: MediaPlayer? = null
    private var currentSong = mutableListOf(R.raw.cut)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi_percakapan)

        controlSound(currentSong[0])
    }
    private fun controlSound(id: Int){
        btn_play.setOnClickListener{

            if (mp == null){
                mp = MediaPlayer.create(this,id)
                Log.d("MainActivity", "ID: ${mp!!.audioSessionId}")

            }
            mp?.start()
            Log.d("MainActivity", "Duration: ${mp!!.duration/1000} seconds")
        }
    }
}