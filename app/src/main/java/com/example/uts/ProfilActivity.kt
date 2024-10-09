package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts.databinding.ActivityProfilBinding

class ProfilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("NAME")

        with(binding){
            txtName.text = name
            btnLogout.setOnClickListener {
                Toast.makeText(this@ProfilActivity, "You have successfully logged out", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@ProfilActivity,LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

