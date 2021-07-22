package com.turtlecode.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.turtlecode.simplecalculator.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addition (view : View) {
        var a = number1.text.toString().toDoubleOrNull()
        var b = number2.text.toString().toDoubleOrNull()
        if (a == null || b == null) {
            textView3.text = "Don't forget to input number"
        } else {
            var result = a + b

            textView3.text = "Result : ${result}"
        }
    }
    fun subtraction (view : View) {
        var a = number1.text.toString().toDoubleOrNull()
        var b = number2.text.toString().toDoubleOrNull()
        if (a == null || b == null) {
            textView3.text = "Don't forget to input number"
        } else {
            var result = a - b

            textView3.text = "Result : ${result}"
        }
    }
    fun multiplication (view : View) {
        var a = number1.text.toString().toDoubleOrNull()
        var b = number2.text.toString().toDoubleOrNull()
        if (a == null || b == null) {
            textView3.text = "Don't forget to input number"
        } else {
            var result = a * b

            textView3.text = "Result : ${result}"
        }
    }
    fun division (view : View) {
        var a = number1.text.toString().toDoubleOrNull()
        var b = number2.text.toString().toDoubleOrNull()
        if (a == null || b == null) {
            textView3.text = "Don't forget to input number"
        } else {
            var result = a / b

            textView3.text = "Result : ${result}"
        }
    }

}