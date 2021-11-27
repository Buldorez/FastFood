package com.example.foodfast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Start(view: android.view.View) {
        val intent = Intent(this@MainActivity,SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}