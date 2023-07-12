package kr.hs.hackaton2023_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kr.hs.hackaton2023_1.databinding.ActivityLoginBinding
import kr.hs.hackaton2023_1.databinding.ActivitySignInBinding

class G_AskActivity : AppCompatActivity() {
    private val binding : ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val FloatingActionButton : FloatingActionButton = findViewById<FloatingActionButton>(R.id.board_write)
        FloatingActionButton.setOnClickListener{
            val intent = Intent(this, )
            binding.signupBT.setOnClickListener { startActivity(intent) }
        }
    }
}