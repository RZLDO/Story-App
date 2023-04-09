package com.example.submissinstoryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.submissinstoryapp.databinding.ActivityMainBinding
import com.example.submissinstoryapp.presentation.login.LoginActivity

class MainActivity : AppCompatActivity() {
    private lateinit var _binding : ActivityMainBinding
    companion object{
        private const val DELAY : Long = 4000
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        supportActionBar?.hide()
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        }, DELAY)
    }
}