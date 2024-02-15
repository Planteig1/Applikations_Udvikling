package com.example.handin_02.Optional_class

class Truck(speed: Int, regularPrice: Int, color: String, val weight: Int) : Car(speed,regularPrice,color) {




    override fun getSalePrice(): Int {
        //Check to see if the weight is over 2000kg
        if (weight > 2000) {
            return (salesPrice * 0.9).toInt()
        }
        return (salesPrice * 0.8).toInt()
    }
}