package com.example.percakapanbahasaarab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pilihan_doa.*

class PilihanDoa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan_doa)

        bab_satu.setOnClickListener{
            val go =  Intent(this@PilihanDoa, IsiPercakapan::class.java)
            startActivity(go)
        }
    }
}