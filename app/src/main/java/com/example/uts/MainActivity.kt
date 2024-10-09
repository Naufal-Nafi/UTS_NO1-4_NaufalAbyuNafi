package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnSubmit.setOnClickListener {
                if(editName.text.toString().equals("")) {
                    Toast.makeText(this@MainActivity, "Enter your name first", Toast.LENGTH_SHORT).show()
                } else {
                    val intent = Intent(this@MainActivity,ProfilActivity::class.java)
                    intent.putExtra("NAME", editName.text.toString())
                    startActivity(intent)
                }
            }
        }
    }
}