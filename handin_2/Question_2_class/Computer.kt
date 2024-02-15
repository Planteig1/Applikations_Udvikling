package com.example.handin_02.Question_2_class

open class Computer(name: String, price: Int, manufacturer: String) {
    val name: String = name
    var price: Int = price
    val manufacturer: String = manufacturer


    //Methods
    var isOn: Boolean = false

    fun toggleOnOff() {
        if (isOn == false) {
            isOn = true
            println("Device is now on")
        } else {
            isOn = false
            println("Device is now off")
        }
    }

    fun takeScreenshot() {
        println("Screenshot taken!")
    }

}