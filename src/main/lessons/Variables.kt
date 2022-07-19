package main.lessons

fun main() {
    val test1: String = "Hello"
    var test2: String = "world"
    test2 = "World"
    var test3 = "!"

    println("$test1 $test2$test3")

    val x1 = 1; val x2 = 2; val x3 = 3
    println ("$x1 + ${x2+x3}")

    val tr = true
    val fl = false
    if (tr or fl) {
        println("true")
    } else {
        println("false")
    }

}