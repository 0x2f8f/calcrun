package main.lessons

fun main() {
    //example 1
    val lamdaFun = { println("Hello world") }
    lamdaFun()

    //example 2
    val hello: () -> Unit = { println("Hello Kotlin") }
    hello();

    //example 3
    { val name = "Yanis"; println("Hello $name") }();

    //example 4
    {
        val name = "Olya";
        println("Hello $name")
    }();

    //example 5
    val printer = { message: String -> println(message) }
    printer("Test");

    //example 6
    val sum = { x: Int, y: Int -> x + y }
    val c = sum(2, 3)
    println(c)

    //example 7
    val sumsum = { a: Int, b: Int ->
        var sum = a + b;
        sum += a + b;
        sum
    }
    val s = sumsum(3, 4);
    println(s)

    //example 8
    val sum2 = { x: Int, y: Int -> x + y }
    doOperation2(3, 4, sum2)

    //example 9
    val sum3: (Int, Int) -> Int = { x, y -> x + y }
    doOperation2(4, 5, sum3)
}

fun doOperation2(a: Int, b: Int, oper: (Int, Int) -> Int) {
    val res = oper(a, b)
    println(res)
}