package com.example.handin_02.Question_3_class

class T_shirt(name: String, price: Int, quantity: Int) : Product(name, price, quantity) {

    override fun identifyProductCategory() {
        println("I am a T-Shirt!")
    }

}