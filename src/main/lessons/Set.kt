package main.lessons

fun main() {
    val people = setOf("Tom", "Sam", "Bob", "Mike")
    val employees = setOf("Tom", "Sam", "Kate", "Alice")

    val all = people.union(employees)
    println(all)

    val intersect = people.intersect(employees)
    println(intersect)

    val subtract = people subtract employees
    println(subtract)

    val numbers: MutableSet<Int> = mutableSetOf(35, 36, 37)
    println(numbers)

    val numbers2 = mutableSetOf(38, 39, 40)
    println(numbers2)

    numbers2.add(41)
    numbers2.remove(38)
    println(numbers2)

    numbers2.clear()
    println(numbers2)
}