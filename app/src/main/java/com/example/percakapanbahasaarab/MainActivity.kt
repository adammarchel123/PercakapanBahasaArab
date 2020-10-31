package com.example.percakapanbahasaarab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_next.setOnClickListener{
            val go =  Intent(this@MainActivity, PilihanDoa::class.java)
            startActivity(go)
        }
    }
}