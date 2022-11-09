package main.lessons

fun main() {
    Something.bar()
    println(Something.age)      //11

    Something.height = 200
    println(Something.height)   //200

    val somObj = Something()
    somObj.width = 666
    println(somObj.width)       //666

    println(Something.cat.name) //Tomas
    println(Something.dog.name) //Goofy

    val animal = Something.Animal
    println(animal.dog.name)    //Goofy
}

class Something {
    companion object Animal{
        val age = 11
        var height = 100
        val cat = Cat()
        @JvmField val dog = Dog()

        fun bar() {
            println("Companion object called")
        }
    }

    var width = 333
}

class Cat {
    val name = "Tomas"
}

class Dog {
    val name = "Goofy"
}