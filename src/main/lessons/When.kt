package main.lessons

fun main() {
    val validNumbers = arrayOf(11, 12, 13)
    val x = 12
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 11..20 -> println("x is outside the range")
        else -> println("none of the above")
    }

    val y = when (x) {
        in 1..10 -> 1
        in validNumbers -> 2
        !in 11..20 -> 3
        else -> 4
    }

    println(y) // 2
}