package com.example.cidza

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_map.*

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        prof1.isClickable = false
        cidziko.setOnClickListener {
            sizarmacei.visibility = View.VISIBLE
        }
        shekveta.setOnClickListener {
            cidziko.visibility = View.INVISIBLE
            locat.visibility = View.INVISIBLE
            mimartuleba.visibility = View.VISIBLE

        }
        prof.setOnClickListener {
            sizarmacei.visibility = View.INVISIBLE
            prof1.visibility = View.VISIBLE
            prof1.isClickable = true
        }
        prof1.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
