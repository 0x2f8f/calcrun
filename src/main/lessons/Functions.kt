package main.lessons

import kotlin.math.*

fun main() {
    /*
    println(discriminant(2, 9, 4))
    println(coube(3))
    println(sqrt2(9.0))
    println(sqrt3(16.0))
     */
    print("Сколько вам лет: ")
    val age: String? = readLine()
    val age1: Int? = if (age != null && age != "") age.toInt() else null
    val age2: String = age ?: ""
    ageInt(age1)
    ageString(age2)
    /*
    if (age != null && age != "") {
        ageFun(age.toInt())
    } else {
        ageFun()
    }
*/
}

fun sqr(x: Int) = x * x

fun discriminant(a: Int, b: Int, c: Int) = sqr(b) - 4 * a * c

fun coube(x: Int): Int {
    var result: Int
    result = x * x
    result *= x

    return result
}

fun sqrt2(a: Double): Double {
    return kotlin.math.sqrt(a)
}

fun sqrt3(a: Double): Double {
    return sqrt(a)
}

fun inInt(x: Int, a: Int, b: Int): Boolean {
    return x > a && x < b
}

fun inArrayInt(x: Int, nums: Array<Int>): Boolean {
    for (a in nums) {
        if (a == x) {
            return true
        }
    }

    return false;
}

fun inRange(x: Int, a1: Int, b1: Int, a2: Int, b2: Int): String {
    when(x) {
        in a1..b1 -> {
            return "range $a1-$b1"
        }
        in a2..b2 -> {
            return "range $a2-$b2"
        }
        else -> {
            return "not in range"
        }
    }
}

fun ageInt(age: Int? = 18) {
    println("Возраст int: $age")
}

fun ageString(age: String? = "18") {
    println("Возраст string: $age")
}