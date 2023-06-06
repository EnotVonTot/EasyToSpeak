package com.example.easytospeak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(view: View) {
        val inten = Intent(this@LoginActivity, LearnActivity::class.java)
        startActivity(inten)
        finish()
    }

    fun register(view: View) {
        val inten = Intent(this@LoginActivity, RegisterActivity::class.java)
        startActivity(inten)
        finish()
    }

}