package com.example.handin_02.Question_2_class

class Laptop(name: String, price: Int, manufacturer: String, hasWebcam: Boolean) : Computer(name, price, manufacturer) {
    val hasWebcam: Boolean = hasWebcam

    fun playMusic() {
        println("Now playing music")
    }
}