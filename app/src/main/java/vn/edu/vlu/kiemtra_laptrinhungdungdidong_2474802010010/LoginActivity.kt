package vn.edu.vlu.kiemtra_laptrinhungdungdidong_2474802010010

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tvStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvStatus = findViewById(R.id.tvStatus)

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString()

            when {
                email.isEmpty() && password.isEmpty() ->
                    showError("Vui lòng nhập Email và Mật khẩu!")
                email.isEmpty() ->
                    showError("Email không được để trống!")
                password.isEmpty() ->
                    showError("Mật khẩu không được để trống!")
                !Patterns.EMAIL_ADDRESS.matcher(email).matches() ->
                    showError("Email sai định dạng!")
                password.length < 6 ->
                    showError("Mật khẩu phải có ít nhất 6 ký tự!")
                else -> {
                    tvStatus.setTextColor(0xFF2E7D32.toInt())
                    tvStatus.text = "Xác thực thành công!"
                }
            }
        }
    }

    private fun showError(message: String) {
        tvStatus.setTextColor(0xFFD32F2F.toInt())
        tvStatus.text = message
    }
}