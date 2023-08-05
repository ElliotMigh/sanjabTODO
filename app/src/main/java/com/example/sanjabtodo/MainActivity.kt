package com.example.sanjabtodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sanjabtodo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //create binding:
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //call welcomeToast function:
        welcomeToast()
    }

    private fun welcomeToast() {
        val toastText: String = "به اپلیکیشن مدریت کارها با سنجاب خوش آمدید"
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show()
    }
}