package com.example.handin_02.Optional_class

//AutoShop

//Create AutoShop class which contains the main() method. Perform the following within the main() method.
//Create an instance of Truck class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass.
//Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the super class.
//Create an instance of Car class and initialize all the fields with appropriate values. Display the sale prices of all instances.
class AutoShop() {


 fun main() {
  val truck1: Truck = Truck(210,2000, "Yellow",2100)

  val ford1: Ford = Ford(200,4000,"Red",2023,20)
  val ford2: Ford = Ford(200,1000,"Red",2023,30)

  val car1: Car = Car(200,1000,"Red")

  val listOfCars: List<Car> = listOf(truck1,ford1,ford2,car1)

  listOfCars.forEach { println(it.getSalePrice()) }

 }

}