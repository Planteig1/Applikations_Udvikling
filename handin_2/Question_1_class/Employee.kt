package com.example.handin_02.Question_1_class

class Employee(firstName: String, lastName: String, salary: Double) {

    val firsName: String = firstName
    val lastName: String = lastName


    var salary: Double = salary
        //Check to see if the salary is above 0, if not change it to 0
        get() {
            if (field < 0) {
                field = 0.0
            }
            return field
        }
        set(value) {
            if (value < 0) {
                field = 0.0
            } else {
                field = value
            }

        }

    val yearlySalary: Double
        get() = salary * 12

}