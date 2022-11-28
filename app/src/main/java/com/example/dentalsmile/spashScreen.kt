package com.example.dentalsmile

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class spashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash_screen)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)

    }
}