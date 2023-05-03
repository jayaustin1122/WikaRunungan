package com.example.wika_runungan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wika_runungan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNolime.setOnClickListener {
            val intent = Intent(this, NolimeActivity::class.java)
            startActivity(intent)
        }
        binding.btnGlosaryo.setOnClickListener {
            val intent = Intent(this, GlosaryActivity::class.java)
            startActivity(intent)
        }
    }
}