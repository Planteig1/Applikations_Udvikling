package com.example.handin_02.Question_3_class

class Shoe(name: String, price: Int, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a Shoe!")
    }

}