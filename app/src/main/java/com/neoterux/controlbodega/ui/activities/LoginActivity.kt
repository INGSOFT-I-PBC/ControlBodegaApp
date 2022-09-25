package com.neoterux.controlbodega.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.neoterux.controlbodega.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        splashScreen.setKeepOnScreenCondition{false}
        val intent = Intent(this, MainActivity::class.java)
        binding.btnLogin.setOnClickListener {
            startActivity(intent)
            finish()

        }
    }
}