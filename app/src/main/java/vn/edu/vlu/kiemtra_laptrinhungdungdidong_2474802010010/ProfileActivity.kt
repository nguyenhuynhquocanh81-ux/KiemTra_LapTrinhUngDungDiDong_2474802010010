package vn.edu.vlu.kiemtra_laptrinhungdungdidong_2474802010010

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        val email = intent.getStringExtra("EMAIL")
        tvEmail.text = "Email: $email"

        btnLogout.setOnClickListener {
            finish()
        }
    }
}