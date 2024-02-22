package com.example.handin_03.exercise02

//2.
//Create an interface called FastFood (with appropriate methods) and create a Sandwich class, a Pizza class and a class you decide that implements the FastFood interface.
//Add some different Fastfood objects to an array. Now iterate through that array and use some of the methods you have created above.

interface FastFood {
    var listOfIngredients: List<String>

    fun prepareFood()

    fun serveFood()
}