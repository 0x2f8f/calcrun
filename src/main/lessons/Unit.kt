package main.lessons

fun main() {
    val a = hello()
    val b = world()
    val c = end()
    println(a)
    println(b)
    println(c)
}

fun hello(): Unit {
    println("Hello")
}

fun world() {
    println("world")
}

fun end() {
    return
}