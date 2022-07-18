package main.lessons

fun main() {
    val mes = fun() = println("hello world")
    mes()

    val mes2 = fun(user: String) = println("hello $user")
    mes2("Yanis")

    val sum2 = fun(a: Int, b: Int): Int = a+b
    println(sum2(3,4))

    val mult2 = fun(a: Int, b: Int): Int {
        return a*b
    }
    println(mult2(3, 4))

    doOperation(5,6, fun(x: Int, y: Int): Int = x+y)
    val op = fun(x: Int, y: Int): Int {
        return x*y
    }
    doOperation(5, 6, op)

    val op2 = selectAction2(1)
    doOperation(6, 9, op2)
}

fun doOperation(a: Int, b: Int, operation: (Int, Int) -> Int) {
    println(operation(a, b))
}

fun selectAction2(key: Int): (Int, Int) -> Int {
    return when (key) {
        1 -> fun (x: Int, y: Int): Int = x+y
        2 ->  fun (x: Int, y: Int): Int = x*y
        else -> fun (_: Int, _: Int): Int = 0
    }
}