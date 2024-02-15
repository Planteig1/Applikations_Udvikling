package com.example.handin_02.Question_4_class

import kotlin.math.abs

abstract class Shape(val color: String, val isTransparent: Boolean) {


     abstract fun calculatePerimeter(): Double

     abstract fun calculateArea(): Double
}