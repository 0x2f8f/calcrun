package main.lessons.scope

import main.lessons.oop.User

fun main() {
    val sam = User("Sam", "sam@gmail.com")

    sam.email?.let {
        println("Email: $it")      // Email: sam@gmail.com
    }
    if (sam.email != null)
        println("Email: ${sam.email}") // аналог без функции let

    val tom = User("Tom", null)
    tom.email?.let {
        println("Email: $it")  // функция let не будет выполняться
    }

    sam.email?.let(::println)   //sam@gmail.com
    sam.email?.let(::printEmail) //Email: sam@gmail.com
}

fun printEmail(email: String) {
    println("Email: $email")
}