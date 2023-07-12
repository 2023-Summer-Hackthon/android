package kr.hs.hackaton2023_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kr.hs.hackaton2023_1.databinding.ActivitySignInBinding

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val binding: ActivitySignInBinding by lazy { ActivitySignInBinding.inflate(layoutInflater) }
        val loginbutton: Button = findViewById<Button>(R.id.signupBT2)
        loginbutton.setOnClickListener {
            val intent = Intent(this, ActivitySignInBinding::class.java)
            binding.signupBT2.setOnClickListener { startActivity(intent) }
        }
    }
}