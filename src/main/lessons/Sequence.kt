package main.lessons

fun main() {
    var people = sequenceOf("Tom", "Sam", "Mike", "Bob", "Alice")
    people = people.filter{it.length == 3}
    for (elm in people) {
        println(elm)
    }
    println(people.joinToString())
}