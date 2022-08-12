package main.lessons.scope

import main.lessons.oop.User

fun main() {
    val tom = User("Tom", null)
    tom.also {
        if (it.email == null) {
            it.email = "${it.name.lowercase()}@gmail.com"
        }
    }

    println(tom.email) //tom@gmail.com
}