package com.example.handin_02.Optional_class

class Ford(speed: Int, regularPrice: Int, color: String, val year: Int, var manufacturerDiscount: Int) : Car(speed,regularPrice,color) {


    override fun getSalePrice(): Int {
        if (manufacturerDiscount > 0) {
            //Check to see if the discount is over 100% - Give it for free
            if (manufacturerDiscount > 100) {
                return 0
            }
            // If there is a discount
            return regularPrice * (100 - manufacturerDiscount) / 100

        }
        // If theres no discount
        return regularPrice
    }
}
