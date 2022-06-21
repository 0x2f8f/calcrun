import kotlin.math.*

fun main() {
    println(discriminant(2, 9, 4))
    println(coube(3))
    println(sqrt2(9.0))
    println(sqrt3(16.0))
}

fun sqr(x: Int) = x * x

fun discriminant(a: Int, b: Int, c: Int) = sqr(b) - 4 * a * c

fun coube(x: Int): Int {
    var result: Int
    result = x*x
    result *= x

    return result
}

fun sqrt2(a: Double): Double {
    return kotlin.math.sqrt(a)
}

fun sqrt3(a: Double): Double {
    return sqrt(a)
}