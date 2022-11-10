package main.lessons

fun main() {
    val validNumbers = arrayOf(11, 12, 13)
    val x = 12
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 11..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}