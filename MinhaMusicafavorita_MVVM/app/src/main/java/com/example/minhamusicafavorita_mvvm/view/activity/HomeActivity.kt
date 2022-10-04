package com.example.minhamusicafavorita_mvvm.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minhamusicafavorita_mvvm.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerDetalhes.setOnClickListener {
            val intent = Intent(this, DetalheActivity::class.java)
            startActivity(intent)
        }
    }
}