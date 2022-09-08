package com.example.guessrandomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val number = Random.nextInt(1000)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun validate(v:View){

        var input = findViewById<EditText>(R.id.guessNo)
        var output = findViewById<TextView>(R.id.guesstext)
        var num = Integer.parseInt(input.text.toString())
        if(num >number){
            output.text = "Your guess is too high.."
        }
        else if(num < number){
            output.text = "Your guess is too low"
        }

        else
            output.text = "Yahooo!!!...you got the number...You won"
    }



}