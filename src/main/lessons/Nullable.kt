package main.lessons

fun main() {
    val name : String?  = null
    val name2 : String?  = ""
    val length :Int = name2!!.length
    println(length)

    displayUser("Tom", 23, "Manager")
    displayUser("Alice", 21)
    displayUser("Kate")

    displayUser(name="Ilya", age=29, "Programmer")
    displayUser("Michail", age=24)
}

fun displayUser(name: String, age: Int = 18, position: String="unemployed"){
    println("Name: $name   Age: $age  Position: $position")
}