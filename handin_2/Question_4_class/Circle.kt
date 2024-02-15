package com.example.handin_02.Question_4_class

class Circle(color: String, isTransparent: Boolean, val radius: Double) : Shape(color, isTransparent) {
    val pie: Double = Math.PI

    override fun calculatePerimeter(): Double {
        return 2 * pie * radius
    }

    override fun calculateArea(): Double {
        return pie * (radius * radius)
    }

}