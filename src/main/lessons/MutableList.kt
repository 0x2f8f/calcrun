package main.lessons

fun main() {
    val numbers1 : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    numbers1.add(4)
    numbers1.clear()

    val numbers2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    numbers2.add(12)
    numbers2.add(0, 23)
    numbers2.addAll(0, listOf(-3, -2, -1))
    numbers2.removeAt(0)
    numbers2.remove(5)

    for (n in numbers2){ println(n) }
}