package main.lessons

fun main() {
    val userFlow = listOf("Tom", "Bob", "Kate", "Sam", "Alice")
    val firstUser = userFlow.first{ name -> name.length > 3}
    println("First User: $firstUser")       // First User: Kate
}