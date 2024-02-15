package com.example.handin_02

import com.example.handin_02.Optional_class.AutoShop
import com.example.handin_02.Optional_class.Truck
import com.example.handin_02.Question_1_class.Employee
import com.example.handin_02.Question_2_class.Laptop
import com.example.handin_02.Question_2_class.SmartPhone
import com.example.handin_02.Question_3_class.Book
import com.example.handin_02.Question_3_class.Shoe
import com.example.handin_02.Question_3_class.T_shirt
import com.example.handin_02.Question_4_class.Circle
import com.example.handin_02.Question_4_class.Rectangle
import com.example.handin_02.Question_4_class.Triangle

fun main() {

    exercise01()

    exercise02()

    exercise03()

    exercise04()

    optional()
}



//1.
//Create a class called Employee that includes three pieces of information as instance variables
//A first name
//A last name
//A monthly salary
//Your class should have a constructor that initializes the three instance variables.
//If the monthly salary is not positive, set it to 0.0.
//Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.

fun exercise01() {

    val person1: Employee = Employee("Henning","Højspænning",2000.00)
    val person2: Employee = Employee("Lucas","Luke",3000.00)

    println(person1.yearlySalary)
    println(person2.yearlySalary)

    person1.salary *= 1.1
    person2.salary *= 1.1

    println(person1.yearlySalary)
    println(person2.yearlySalary)

}

//Create a new class called Computer. Before you add any more code,
// know that you will need to add two additional classes: Laptop and SmartPhone
//For a parent class add 3 properties, 2 methods, and a constructor.
//For a child class add at least 1 additional property and 1 additional method.
//In the main method create a Laptop and a SmartPhone
fun exercise02() {

    val laptop: Laptop = Laptop("Macbook Pro", 1300, "Apple", true)

    laptop.toggleOnOff()
    laptop.toggleOnOff()
    laptop.playMusic()

    val smartPhone: SmartPhone = SmartPhone("Iphone 13",1000,"Apple","Purple")

    smartPhone.whatColorAmI()
    smartPhone.takeScreenshot()

}

//Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory.
// Subclass it to create specific product types like Shoe, T-shirt, and Book. Override the function such that:
//The shoe outputs "I am a shoe" .
//The T-shirt outputs "I am a T-shirt"
//The book outputs "I am a book"

fun exercise03() {
    val shoe: Shoe = Shoe("Nike airmax",100,30)
    val t_shirt: T_shirt = T_shirt("Samsø Samsø Hvid Tee",80,100)
    val book: Book = Book("Can't Hurt Me",50,350)

    shoe.identifyProductCategory()
    t_shirt.identifyProductCategory()
    book.identifyProductCategory()
}
// Create 3 classes Circle, Rectangle & Triangle with a parent class: Shape.
//Every shape has two attributes color, isTransparent
//Furthermore every class has private attributes to calculate perimeter and area for each shape.
//E.g. a Rectangle has the attributes: height, width, color & isTransparent
//The attributes are set in the constructor
//The 3 classes all overrides the following abstract methods from their parent class:
//calculatePermeter
//calculateArea
//The functions will return the permeter or area of the shape.
fun exercise04() {

    val rectangle: Rectangle = Rectangle("Blue",true,10.0,20.0)
    println(rectangle.calculateArea())
    println(rectangle.calculatePerimeter())

    val circle: Circle = Circle("Red",true,10.0)
    println(circle.calculateArea())
    println(circle.calculatePerimeter())

    val listOfSides: List<Double> = listOf(40.0,50.0,20.0)
    val triangle: Triangle = Triangle("Yellow",false,listOfSides)
    println(triangle.calculatePerimeter())
    println(triangle.calculateArea())

}

//Autoshop - optional
//Create a super class called Car. The Car class has the following fields and methods.
//speed, regularPrice, color , getSalePrice()

//Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
//weight, getSalePrice()
//If the weight of a Truck is more than 2000 kg then there is a discount of 10% otherwise 20%

//Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
//year, manufacturerDiscount, getSalePrice()
//If a manufacturerDiscount is set then the salesPrice will be that much cheaper

//AutoShop

//Create AutoShop class which contains the main() method. Perform the following within the main() method.
//Create an instance of Truck class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the superclass.
//Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...) method in the constructor for initializing the fields of the super class.
//Create an instance of Car class and initialize all the fields with appropriate values. Display the sale prices of all instances.

fun optional() {

    val autoShop: AutoShop = AutoShop()

    autoShop.main()



}