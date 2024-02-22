package com.example.handin_03.exercise02

class Pizza(val name: String, override var listOfIngredients: List<String>, var price: Int, var prepareTime: Int) : FastFood {

    override fun prepareFood() {
        println("Preparing Food, Please wait $prepareTime minutes")

    }

    override fun serveFood() {
        println("$name has been served")
    }
}