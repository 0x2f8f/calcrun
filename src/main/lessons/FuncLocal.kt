package main.lessons

fun main() {
    val a = oneLineCoube(2)
    println(a)
    println(oneLineCoube(3))
    println("Max age 18, 30: "+ maxAge(18, 30))
    println("Max age 18, 30: "+ maxAge(-2, -5))
}

fun oneLineCoube(x: Int) = x * x * x

fun maxAge(a: Int, b: Int): Int {

    fun validation(x: Int): Boolean {
        return (x < 110)
    }

    if (!validation(a) || !validation(b)) {
        return -1
    }

    return if (a > b) a else b
}