package com.example.kotlinactivity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinactivity1.databinding.ActivityMainBinding
import com.example.kotlinactivity1.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(binding.container.id, MainFragment()).commit()
    }
}