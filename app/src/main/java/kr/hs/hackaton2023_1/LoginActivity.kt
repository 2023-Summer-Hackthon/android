package kr.hs.hackaton2023_1;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kr.hs.hackaton2023_1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
        private val binding: ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater)}
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(binding.root)
                val btlogin: Button = findViewById<Button>(R.id.loginBT)
                btlogin.setOnClickListener {
                        val intent = Intent(this, SignupActivity::class.java)
                        binding.loginBT.setOnClickListener { startActivity(intent) }
                }
                val btsignup : Button = findViewById<Button>(R.id.signupBT)
                btsignup.setOnClickListener {
                        val intent = Intent(this, SignupActivity::class.java)
                        binding.signupBT.setOnClickListener { startActivity(intent) }
                }
        }
}