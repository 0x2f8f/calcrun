package main.lessons

fun main() {
    val peopleToAge = mapOf("Alice" to 20, "Bob" to 21)
    if (contains21(peopleToAge)) {
        println("contains 21")                       //contains 21
    } else {
        println("not contains 21")
    }

    if (peopleToAge.any { it.value == 20}) {
        println("contains 20")                       //contains 20
    } else {
        println("not contains 20")
    }

    if (containsAge(peopleToAge, 19)) {
        println("contains 19")
    } else {
        println("not contains 19")                  //not contains 19
    }
}

private fun contains21(people: Map<String, Int>): Boolean {
    return people.any{
        it.value == 21
    }
}

private fun containsAge(people: Map<String, Int>, age: Int): Boolean {
    return people.any{
        it.value == age
    }
}