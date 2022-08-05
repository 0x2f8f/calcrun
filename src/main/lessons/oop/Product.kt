package main.lessons.oop

fun main() {
    val prod1 = Product("iphone 13 pro", "best of phones")
    println(prod1)
    println("Title: ${prod1.title}, description: ${prod1.descr}")
}

class Product(val title: String, var descr: String) {
    override fun toString(): String {
        return "Title - $title, Description - $descr"
    }
}