package com.example.handin_03.exercise02

class Pasta(var name: String, override var listOfIngredients: List<String>, var prepareTime: Int) : FastFood {

    override fun prepareFood() {
        println("Preparing Food, Please wait $prepareTime minutes")

    }

    override fun serveFood() {
        println("$name has been served")
    }
}