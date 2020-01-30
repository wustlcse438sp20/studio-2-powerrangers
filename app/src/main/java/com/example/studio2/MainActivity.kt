package com.example.studio2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var totalMoney = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initButton()
    }

    private fun initButton() {
        val changeBtn = findViewById<Button>(R.id.edit_balance_button)
        changeBtn.setOnClickListener {
            toChangeActivity()
        }
    }

    private fun toChangeActivity() {
        val toChangeActivity = Intent(this, ChangeActivity::class.java)
        startActivity(toChangeActivity)
    }

}
