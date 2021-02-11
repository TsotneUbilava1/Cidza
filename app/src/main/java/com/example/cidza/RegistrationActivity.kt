package com.example.cidza

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        editTX4.isClickable = false
        editTX5.isClickable = false
        editTX6.isClickable = false
        editTX7.isClickable = false
        editTX8.isClickable = false
        editTX9.isClickable = false
        nextBtn2.isClickable = false
        nextBtn3.isClickable = false
        reject1.isClickable = false
        reject2.isClickable = false
        nextBtn1.setOnClickListener {
            editTX1.isClickable = false
            editTX2.isClickable = false
            editTX3.isClickable = false
            editTX4.isClickable = true
            editTX5.isClickable = true
            editTX6.isClickable = true
            nextBtn1.isClickable = false
            nextBtn2.isClickable = true
            page2frame.background = getDrawable(R.mipmap.circle)
            page1frame.background = getDrawable(R.drawable.nothing)
            regPageOne.visibility = View.INVISIBLE
            regPageTwo.visibility = View.VISIBLE
            reject1.isClickable = true
            reject2.isClickable = false
        }
        nextBtn2.setOnClickListener {
            page3frame.background = getDrawable(R.mipmap.circle)
            page2frame.background = getDrawable(R.drawable.nothing)
            editTX4.isClickable = false
            editTX5.isClickable = false
            editTX6.isClickable = false
            editTX7.isClickable = true
            editTX8.isClickable = true
            editTX9.isClickable = true
            nextBtn1.isClickable = false
            nextBtn2.isClickable = false
            nextBtn3.isClickable = true
            regPageTwo.visibility = View.INVISIBLE
            regPageThree.visibility = View.VISIBLE
            reject1.isClickable = false
            reject2.isClickable = true

        }
        nextBtn3.setOnClickListener {
            nextBtn1.isClickable = true
            editTX1.isClickable = true
            editTX2.isClickable = true
            editTX3.isClickable = true
            editTX4.isClickable = false
            editTX5.isClickable = false
            editTX6.isClickable = false
            editTX7.isClickable = false
            editTX8.isClickable = false
            editTX9.isClickable = false
            nextBtn2.isClickable = false
            nextBtn3.isClickable = false
            reject1.isClickable = false
            reject2.isClickable = false
            startActivity(Intent(this, AuthActivity::class.java))

        }
        reject1.setOnClickListener {
            page1frame.background = getDrawable(R.mipmap.circle)
            page2frame.background = getDrawable(R.drawable.nothing)
            page3frame.background = getDrawable(R.drawable.nothing)
            nextBtn1.isClickable = true
            editTX1.isClickable = true
            editTX2.isClickable = true
            editTX3.isClickable = true
            editTX4.isClickable = false
            editTX5.isClickable = false
            editTX6.isClickable = false
            editTX7.isClickable = false
            editTX8.isClickable = false
            editTX9.isClickable = false
            nextBtn2.isClickable = false
            nextBtn3.isClickable = false
            regPageOne.visibility = View.VISIBLE
            regPageTwo.visibility = View.INVISIBLE
            regPageThree.visibility = View.INVISIBLE
            reject1.isClickable = false
            reject2.isClickable = false

        }
        reject2.setOnClickListener {
            page1frame.background = getDrawable(R.mipmap.circle)
            page2frame.background = getDrawable(R.drawable.nothing)
            page3frame.background = getDrawable(R.drawable.nothing)
            nextBtn1.isClickable = true
            editTX1.isClickable = true
            editTX2.isClickable = true
            editTX3.isClickable = true
            editTX4.isClickable = false
            editTX5.isClickable = false
            editTX6.isClickable = false
            editTX7.isClickable = false
            editTX8.isClickable = false
            editTX9.isClickable = false
            nextBtn2.isClickable = false
            nextBtn3.isClickable = false
            regPageOne.visibility = View.VISIBLE
            regPageTwo.visibility = View.INVISIBLE
            regPageThree.visibility = View.INVISIBLE
            reject1.isClickable = false
            reject2.isClickable = false
        }
        shesvla.setOnClickListener {
            startActivity(Intent(this, AuthActivity::class.java))
        }
    }
}
