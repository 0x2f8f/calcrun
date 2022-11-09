package main.lessons

fun main() {
    Something.bar()
    println(Something.age)      //11

    Something.height = 200
    println(Something.height)   //200

    val somObj = Something()
    somObj.width = 666
    println(somObj.width)       //666
}

class Something {
    companion object {
        val age = 11
        var height = 100

        fun bar() {
            println("Companion object called")
        }
    }

    var width = 333
}