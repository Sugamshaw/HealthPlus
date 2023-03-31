package com.example.prototype2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.example.prototype2.databinding.ActivityHomeactivityBinding


class homeactivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@homeactivity, uploadactivity::class.java)
            startActivity(intent)
        })
        binding.fab4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@homeactivity, viewprescription::class.java)
            startActivity(intent)
        })
        binding.fab3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@homeactivity, termcon::class.java)
            startActivity(intent)
        })
        binding.fab9.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@homeactivity, notificationactivity::class.java)
            startActivity(intent)
        })

    }
}