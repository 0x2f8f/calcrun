package main.lessons.oop

fun main() {
    val tom: Person = Person()
    tom.name = "Tom"
    tom.age = 23

    println("Name: "+tom.name)
    println("Age: "+tom.age)

    tom.hello()
    tom.go("Gothom city")
}

class Person {
    var name: String = "Undefined"
    var age: Int = 18

    fun hello() {
        println("Hello, my name is $name")
    }

    fun go(location: String) {
        println("$name go to $location")
    }
}