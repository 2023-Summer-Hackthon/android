package kr.hs.hackaton2023_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kr.hs.hackaton2023_1.databinding.ActivityLoginBinding
import kr.hs.hackaton2023_1.databinding.ActivityMainBinding
import kr.hs.hackaton2023_1.databinding.ActivitySignInBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val chatBT : ImageButton = findViewById<ImageButton>(R.id.imageButton)
        val cashBT : ImageButton = findViewById<ImageButton>(R.id.imageButton2)
        val G_askBT : ImageButton = findViewById<ImageButton>(R.id.imageButton3)
        chatBT.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            binding.imageButton.setOnClickListener { startActivity(intent) }
        }
        cashBT.setOnClickListener{
            val intent = Intent(this, CashShopActivity::class.java)
            binding.imageButton2.setOnClickListener { startActivity( intent )}
        }
        G_askBT.setOnClickListener{
            val intent = Intent(this, G_AskActivity::class.java)
            binding.imageButton3.setOnClickListener { startActivity( intent )}
        }
    }
}