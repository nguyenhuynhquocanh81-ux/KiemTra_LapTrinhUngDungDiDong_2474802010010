package vn.edu.vlu.kiemtra_laptrinhungdungdidong_2474802010010

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val lvMonHoc = findViewById<ListView>(R.id.lvMonHoc)

        val email = intent.getStringExtra("EMAIL")
        tvEmail.text = "Email: $email"

        btnLogout.setOnClickListener {
            finish()
        }

        val danhSach = arrayOf(
            "Lập trình Kotlin",
            "Thiết kế Layout XML",
            "Quản lý Git/GitHub",
            "Xử lý Intent",
            "Kiến trúc Android"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            danhSach
        )

        lvMonHoc.adapter = adapter

        lvMonHoc.setOnItemClickListener { _, _, position, _ ->
            val monHoc = danhSach[position]

            Toast.makeText(
                this,
                monHoc,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}