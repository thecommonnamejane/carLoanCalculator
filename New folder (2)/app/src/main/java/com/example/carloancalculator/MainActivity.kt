package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {

            val amount:Double = editTextCarPrice.text.toString().toDouble()
            val result:Double = amount * 0.12345

            textViewLoan.text = "Car loan : RM %.2f".format(result)

        }
    }
}

