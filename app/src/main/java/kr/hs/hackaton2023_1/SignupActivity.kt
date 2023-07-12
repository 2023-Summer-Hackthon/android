package kr.hs.hackaton2023_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.hs.hackaton2023_1.databinding.ActivitySignInBinding
import kr.hs.hackaton2023_1.databinding.ActivitySignUpBinding

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val binding: ActivitySignInBinding by lazy { ActivitySignInBinding.inflate(layoutInflater)}
            setContentView(binding.root)
            val intent = Intent(this, SigninActivity::class.java)
            binding.signupBT2.setOnClickListener{startActivity(intent)}

    }
}