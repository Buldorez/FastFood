package com.example.foodfast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

    fun sign(view: android.view.View) {
        val intent = Intent(this@SignInActivity,MainScreen::class.java)
        startActivity(intent)
        finish()
    }
    fun reg(view: android.view.View) {
        val intent = Intent(this@SignInActivity,SignUpScreen::class.java)
        startActivity(intent)
        finish()
    }
}