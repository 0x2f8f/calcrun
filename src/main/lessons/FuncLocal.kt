package main.lessons

fun main() {
    val a = oneLineCoube(2)
    println(a)
    println(oneLineCoube(3))
    println("Max age 18, 30: "+ maxAge(18, 30))
    println("Max age -2, -5: "+ maxAge(-2, -5))
    println("Max age 110, 120: "+ maxAge(110, 120))
}

fun oneLineCoube(x: Int) = x * x * x

fun maxAge(a: Int, b: Int): Int {
    fun validationMax(x: Int): Boolean {
        return (x < 110)
    }

    fun validationMin(x: Int): Boolean {
        return (x >= 0)
    }

    if (!validationMax(a) || !validationMax(b)) {
        return -1
    }

    if (!validationMin(a) || !validationMin(b)) {
        return -1
    }

    return if (a > b) a else b
}