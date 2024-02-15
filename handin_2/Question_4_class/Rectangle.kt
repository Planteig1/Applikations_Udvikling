package com.example.handin_02.Question_4_class

class Rectangle(color: String, isTransparent: Boolean, val height: Double, val width: Double) : Shape(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }

    override fun calculateArea(): Double {
        return width * height
    }
}