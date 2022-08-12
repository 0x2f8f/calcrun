package main.lessons.scope

import main.lessons.oop.User

fun main() {
    val tom = User("Tom", null)

    val emailOfTom = with(tom) {
        if(email==null)
            email = "${name.lowercase()}@gmail.com"
        email
    }
    println(emailOfTom) // tom@gmail.com
}