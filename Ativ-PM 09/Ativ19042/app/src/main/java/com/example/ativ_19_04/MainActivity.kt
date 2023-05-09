package com.example.ativ_19_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        // rollDice()
    }



    private fun rollDice() {

        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView4)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        val rolagem = dice.roll()
        val TextF: TextView= findViewById(R.id.text)
        val resultText: EditText = findViewById(R.id.result_text)



        if (diceRoll == resultText.text.toString().toInt()){
            TextF.text =  " GANHOU "
        } else {
            TextF.text  = "PERDEU "
        }


    }

}





