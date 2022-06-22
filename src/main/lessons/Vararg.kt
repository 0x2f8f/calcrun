package main.lessons

fun main() {
    printVars("Sergey", "Misha", "Ilya")
    printVars("Kotlin", "JavaScript", "Java", "C#", "C++")

    printUserGroup(2, "Olya", "Lera")

    printCars(3, "Rio", "Picanto", "Sportage", brand = "Kia")

    val nums: IntArray = intArrayOf(1, 2, 3)
    koefList(*nums, koef = 2)
}

fun printVars(vararg words: String) {
    for (word in words) {
        println(word)
    }
    println()
}

fun printUserGroup(count: Int, vararg names: String) {
    println("Count: $count")
    for (name in names) {
        print(name + " ")
    }
    println("\n")
}

fun printCars(count: Int, vararg models: String, brand: String) {
    println("Count: $count")
    println("Brand: $brand")
    for (model in models) {
        print("$model ")
    }
    println("\n")
}

fun koefList(vararg nums: Int, koef: Int) {
    for (num in nums) {
        println(num * koef)
    }
}