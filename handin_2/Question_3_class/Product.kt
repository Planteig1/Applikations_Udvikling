package com.example.handin_02.Question_3_class

open class Product(val name: String, var price: Int, var quantity: Int) {

    open fun identifyProductCategory() {
        println("I am a product!")
    }
}