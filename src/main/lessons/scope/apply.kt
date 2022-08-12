package main.lessons.scope

import main.lessons.oop.User

fun main() {
    val tom = User("Tom", null)
    tom.apply {
        if (email == null) {
            email = "${name.lowercase()}@gmail.com"
        }
    }

    println(tom.email)
}