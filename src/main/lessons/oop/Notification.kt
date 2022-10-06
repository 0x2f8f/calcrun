package main.lessons.oop

fun main() {
    val notification = Notification()
    println(notification.getRundomTitle())
}

class Notification {
    fun getTitle(): String {
        return "Custom title"
    }

    fun getRundomTitle(): String {
        val titles = listOf(
            "Tom",
            "Sam",
            "Kate",
            "Bob",
            "Alice",
            "Mike",
            "John",
            "Oliver",
            "Kevin",
            "Mikle",
            "Staphanis",
        )

        return titles.get((0..10).random())
    }
}