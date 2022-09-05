package com.example.factorialnsquare

//Worksheet-1.2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.et_num1)
        val fact = findViewById<TextView>(R.id.tv_fact)
        val sqr = findViewById<TextView>(R.id.tv_sqr)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)


//        SUBMIT Button
        btn1.setOnClickListener {
            val val1 = num1.text.toString().toInt()

//            Factorial
            var factorial: Long=1
            for (i in 1..val1){
                factorial *= i.toLong() //Long is to store large value
            }

//            Square
            val square = val1 * val1

            fact.setText(factorial.toString())
            sqr.setText(square.toString())
        }

//        CLEAR Button
        btn2.setOnClickListener {
            num1.setText("")
            fact.setText("")
            sqr.setText("")
        }

//        CLOSE Button
        btn3.setOnClickListener {
            finish()
            System.out.close()
//            System.exit(0)

//            Showing Message
            val exit = Toast.makeText(this, "Application Closed !\nThank You for Using.", Toast.LENGTH_LONG)
            exit.show()
        }

    }
}
