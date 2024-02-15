package com.example.handin_02.Question_2_class

class SmartPhone(name: String, price: Int, manufacturer: String, color: String) : Computer(name, price, manufacturer) {
    val color: String = color

    fun whatColorAmI() {
        println("You are a $color phone")
    }
}