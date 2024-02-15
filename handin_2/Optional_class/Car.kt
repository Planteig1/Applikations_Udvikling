package com.example.handin_02.Optional_class

open class Car(val speed: Int, val regularPrice: Int, val color: String) {

    var salesPrice: Int = regularPrice

    open fun getSalePrice(): Int{
        return regularPrice
    }

}


