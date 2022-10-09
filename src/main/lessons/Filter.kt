package main.lessons

fun main() {
    employees()
    filterByType()
    filterByIndex()
    filterNotNull()
}

private fun filterNotNull() {
    println("---filtered not null---")
    val people = listOf(
        Man("Tom"),
        null,
        Man("Sam"),
        null
    )
    println(people.filterNotNull())
}

private fun filterByIndex() {
    println("---filtered by index---")
    val people = listOf("Tom", "Mike", "Sam", "Bob", "Alice")
    val filtered = people.filterIndexed { index, s -> (index % 2 == 0) && s.length < 4 }
    println(filtered)
}


private fun filterByType() {
    println("---filtered by type---")
    val people = listOf(
        Man("Tom"),
        Man("Sam"),
        Employee("Bob"),
        Employee("Mike"),
    )
    val employees = people.filterIsInstance<Employee>()
    println(employees.joinToString())
}

private fun employees() {
    val employees = listOf(
        Person("Tom", 37),
        Person("Bob", 41),
        Person("Sam", 25)
    )

    val employees2 = employees.filter { it.age > 30 }
    println(employees2.joinToString())

    val employee3 = employees.filterNot { it.age > 40 }
    println(employee3.joinToString())
}

data class Person(
    val name: String,
    val age: Int
    )

open class Man(val name: String){
    override fun toString(): String  = name
}
class Employee(name: String): Man(name)