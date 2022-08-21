package com.harry.kotlinlib

fun main(){

    var newAge : Int = 0
    while (newAge== 0) {
        println("How old are you: ")
        readLine().let { userInput ->
            if (!userInput.isNullOrEmpty()) {
                if (userInput.all{char -> char.isDigit()  }){
                  newAge = userInput.toInt()
                }
              else {
                  println("Wrong Input")
                   newAge
              }

            }

            else {
                println("No Input given")
            }
        }
    }
    println("My age is $newAge")


}