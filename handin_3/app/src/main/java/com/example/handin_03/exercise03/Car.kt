package com.example.handin_03.exercise03

class Car(val numberOfGears: Int, val topSpeed: Int, var color: String) : Vehicle {

    var currentSpeed: Int = 0

    override fun applyBrakes(a: Int) {
        println("Braking the car by $a")
        currentSpeed -= a
        println("Current speed is now $currentSpeed")

    }

    override fun changeGear(a: Int) {
        if (a > numberOfGears || a < -2) println("Please select a valid gear!")
        println("Current Gear is now $a")
    }

    override fun speedUp(a: Int) {
        if (a + currentSpeed > topSpeed) println("We cant go that fast!")

        currentSpeed += a
        println("Current speed is now $currentSpeed")
    }

}