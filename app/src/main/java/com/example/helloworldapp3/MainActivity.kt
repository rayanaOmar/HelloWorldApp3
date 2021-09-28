package com.example.helloworldapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception


class MainActivity : AppCompatActivity() {

    var in1 = 0f
    var in2 = ""
    var in3 = 0f

    lateinit var firstNumber: EditText
    lateinit var operator: EditText
    lateinit var secondNumber: EditText
    lateinit var result: TextView
    lateinit var okbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber = findViewById(R.id.firstNum)
        operator = findViewById(R.id.operator)
        secondNumber = findViewById(R.id.secondNum)

        result = findViewById(R.id.theResult)
        okbutton = findViewById(R.id.okButton)

        okbutton.setOnClickListener() {
            in1 = firstNumber.text.toString().toFloat()
            in2 = operator.text.toString()
            in3 = secondNumber.text.toString().toFloat()

            val Result = operatorFun(in1,in2,in3)
            result.text = Result.toString()
        }
    }
    fun operatorFun(fnum: Float, operator: String, snum: Float): Float {
        try {
            var Fresult = 0f
            if (operator == "+") {
                Fresult = fnum + snum
            } else if (operator == "-") {
                Fresult = fnum - snum
            } else if (operator == "*") {
                Fresult = fnum * snum
            } else {
                Fresult = fnum / snum
            }
            return Fresult
        } catch (e: Exception) {
            return 0f
        }
    }
}

