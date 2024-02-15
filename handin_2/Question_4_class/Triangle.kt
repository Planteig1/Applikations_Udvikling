package com.example.handin_02.Question_4_class

import kotlin.math.sqrt

class Triangle(color: String, isTransparent: Boolean, val listOfSides: List<Double>) : Shape(color, isTransparent) {
    val side1: Double = listOfSides[0]
    val side2: Double = listOfSides[1]
    val side3: Double = listOfSides[2]

    override fun calculatePerimeter(): Double {
        return side1 + side2 + side3
    }

    override fun calculateArea(): Double {
        // Calculate height -> area using Herons formula
        // Find the semi perimeter aka perimeter divided by 2
        val semiPerimeter: Double = calculatePerimeter() / 2

       return sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3))

    }
}