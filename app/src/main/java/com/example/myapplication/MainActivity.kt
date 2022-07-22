package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.button)
        val dice1=Dice(6)
        rollbutton.setOnClickListener {
            val imageresult: ImageView=findViewById(R.id.imageView)
             val drawable = when (dice1.roll()) {
                1 -> R.drawable._dice
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            }
            imageresult.setImageResource(drawable)
            imageresult.contentDescription= dice1.roll().toString()
            val toast1=Toast.makeText(this, "Dice rolled!!!", Toast.LENGTH_SHORT)
            toast1.show()

        }
        }
    }
class Dice(val n: Int){

    fun roll(): Int {
        return (1..n).random()
    }
    }