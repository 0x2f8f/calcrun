package main.lessons.scope

import main.lessons.oop.User

fun main() {
    val tom = User("Tom", null)

    val emailOfTom = tom.run {
        if (email == null) {
            email = "${name.lowercase()}@gmail.com"
        }
        email
    }

    println(emailOfTom) // tom@gmail.com


    val sam = User("Sam", "sam@gmail.com")
    var issetEmail = sam.email?.run { "isset" } ?: "not isset"
    println(issetEmail) //isset

    val bob = User("Bob", null)
    issetEmail = bob.email?.run { "isset" } ?: "not isset"
    println(issetEmail) //not isset

    val textVal = run {"Hello world"}
    println(textVal)

    run { println("Welcome!") }
}