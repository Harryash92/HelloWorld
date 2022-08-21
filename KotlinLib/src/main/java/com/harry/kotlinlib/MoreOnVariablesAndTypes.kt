package com.harry.kotlinlib

fun main () {
    println("Hello World")
    println("Testing Variables")

    var harry: String
    harry = "Harikesh Vishwakarma"
    println(harry)

    var harryWeeklySalary: Int
    harryWeeklySalary= 32
    var monthly: Int
    monthly= harryWeeklySalary * 4
    println("In one week harry salary is $harryWeeklySalary")
    println("harry monthly salary is $monthly and anuual salary is ${monthly * 12}" )

    println()

    val apples: Double = 7.0
    val grapes: Double =3.0
    val fruits: Double = apples / grapes
    println("$apples apples and $grapes grapes are " + fruits)

    println("My name is $harry")
    println("My name is \$harry")

}