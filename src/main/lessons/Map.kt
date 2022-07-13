package main.lessons

import java.util.Dictionary

fun main() {
    val people = mapOf(1 to "Tom", 4 to "Sam", 8 to "Bob")
    printMap(people)

    val dictionary = mapOf("red" to "красный", "blue" to "синий", "green" to "зеленый")
    getMap(dictionary)

    checkGetOrDefault(dictionary)
    checkGetOrElse(dictionary)

    keyValues(dictionary)
    containsKeyValue(dictionary)
}

fun printMap(people: Map<Int, String>) {
    for (person in people) {
        println(person)
    }
    println()

    for (person in people) {
        println(person.key)
    }
    println()

    for (person in people) {
        println(person.value)
    }
    println()

    for (person in people) {
        println("${person.key} - ${person.value}")
    }
    println()
}

fun getMap(dictionary: Map<String, String>) {
    val blue = dictionary.get("blue")
    println(blue)

    val green = dictionary["green"]
    println(green)

    val yellow = dictionary.get("yellow")
    println(yellow)   // null

    val black = dictionary["black"]
    println(black)

    println()
}

fun checkGetOrDefault(dictionary: Map<String, String>) {
    val black = dictionary.getOrDefault("black", "ЧЁРНЫЙ")
    println(black)

    val blue = dictionary.getOrDefault("blue", "СИНИЙ")
    println(blue)
    println()
}

fun checkGetOrElse(dictionary: Map<String, String>) {
    val black = dictionary.getOrElse("black") {"Not found"}
    val blue = dictionary.getOrElse("blue") { "NOT FOUND" }
    val pink = dictionary.getOrElse("pink") {  }
    println(black)
    println(blue)
    println(pink)
    println()
}

fun keyValues(dictionary: Map<String, String>) {
    println(dictionary.keys)
    println(dictionary.values)
    println()
}

fun containsKeyValue(dictionary: Map<String, String>) {
    println(dictionary.containsKey("black"))
    println(dictionary.containsKey("blue"))
    println(dictionary.containsValue("чёрный"))
    println(dictionary.containsValue("синий"))
    println()
}