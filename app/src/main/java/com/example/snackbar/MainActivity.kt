package com.example.snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

           val snackBar= Snackbar.make(it,"I am an Android",Snackbar.LENGTH_LONG).setAction("Action",null)

            val snackbarView=snackBar.view
            snackbarView.setBackgroundColor(Color.BLACK)
            snackBar.show()
        }
    }
}