package main.lessons

fun main() {
    val arr2 = arrayOf("Ivanov", "Ivan", "Ivanovich", null, 1, 2, 3, 4)
    for (item in arr2) {
        val len = item.toString().length
        if (len > 1) {
            if (len%2 == 0) {
                println(1)
                if (len == 4) {
                    continue;
                }
            } else {
                println(2)
            }
            println(3)
        } else {
            println(4)
        }
    }
}