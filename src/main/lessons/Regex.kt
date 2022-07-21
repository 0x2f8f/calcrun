package main.lessons

fun main() {
    val r1 = Regex("[a-z]+")
    println(r1.matches("ABCdef")) //false
    println(r1.matches("abcdef")) //true

    //private val nameRegex = Regex("[a-zA-Z0-9_]{1,255}")
    val r2 = Regex("[a-zA-Z0-9_]+")
    println(r2.matches("ABC123")) //true
    println(r2.matches("ABC123-")) //false

    val r3 = Regex("[a-zA-Z0-9_-]+")
    println(r3.matches("ABC123-")) //true
}