package com.example.trendyverse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.trendyverse.databinding.ActivityHomeBinding
import com.example.trendyverse.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {
    lateinit var auth : FirebaseAuth
    private lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()
        binding.logOut.setOnClickListener {
            auth.signOut()
          startActivity(Intent(this,LoginActivity::class.java))
            Toast.makeText(this,"Logged Out Successfully",Toast.LENGTH_SHORT).show()
        }
    }
}