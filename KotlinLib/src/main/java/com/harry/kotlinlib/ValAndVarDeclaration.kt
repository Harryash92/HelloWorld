package com.harry.kotlinlib

fun main () {
    println("Hello World")
    println("Testing Variables")

    val harry = "Harikesh Vishwakarma"
   // error as val can't be reassigned harry = "harry"
    println(harry)

    val harryWeeklySalary = 32
    val monthly: Int = harryWeeklySalary * 4
    println("In one week harry salary is $harryWeeklySalary")
    println("harry monthly salary is $monthly and anuual salary is ${monthly * 12}" )

    println()

    val apples = 7.0
    val grapes =3.0
    val fruits: Double = apples / grapes
    println("$apples apples and $grapes grapes are $fruits")

    println("My name is $harry")
    println("My name is \$harry")

}