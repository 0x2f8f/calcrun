package main.lessons.scope

import main.lessons.oop.Employee
import main.lessons.oop.User

fun main() {
    val tom = User("Tom", null)
    tom.apply {
        if (email == null) {
            email = "${name.lowercase()}@gmail.com"
            nick = this.name.lowercase()
        }
    }

    println(tom.email)
    println("Nick: ${tom.nick}")

    val bob = Employee()
    bob.name("Bob")
        .age(18)
        .company("Adidas")

    println("${bob.name} (${bob.age}) - ${bob.company}")

}