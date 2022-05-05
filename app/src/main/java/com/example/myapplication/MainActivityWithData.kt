package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainDataBinding

class MainActivityWithData : AppCompatActivity() {
    private lateinit var binding: ActivityMainDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainDataBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val person = Person("YD", "Developer")

        binding.person = person
    }
}