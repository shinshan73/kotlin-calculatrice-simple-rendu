package com.example.calculator_simple


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //addition
        button.setOnClickListener() {
            var a:Double = editTextTextPersonName.text.toString().toDouble()
            var b:Double = editTextTextPersonName2.text.toString().toDouble()
            var result:Double = a + b
            textView2.text = result.toString()
        }

        //soustraction
        button2.setOnClickListener() {
            var a:Double = editTextTextPersonName.text.toString().toDouble()
            var b:Double = editTextTextPersonName2.text.toString().toDouble()
            var result:Double = a - b
            textView2.text = result.toString()
        }

        //division
        button3.setOnClickListener() {
            var a:Double = editTextTextPersonName.text.toString().toDouble()
            var b:Double = editTextTextPersonName2.text.toString().toDouble()
            var result:Double = a / b
            textView2.text = result.toString()
        }

        //multiplication
        button4.setOnClickListener() {
            var a:Double = editTextTextPersonName.text.toString().toDouble()
            var b:Double = editTextTextPersonName2.text.toString().toDouble()
            var result:Double = a * b
            textView2.text = result.toString()
        }
    }
}