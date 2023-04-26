package com.example.ativ_19_04

class Dice(private val numSides: Int) {


    fun roll(): Int {
        return (1..numSides).random()
    }
}
