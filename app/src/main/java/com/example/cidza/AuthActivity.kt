package com.example.cidza

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        login.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }
        regBtn.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
    }
}
