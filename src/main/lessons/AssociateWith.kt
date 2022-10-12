package main.lessons

fun main() {
    val words = listOf("a", "abc", "ab", "def", "abcd")
    val withLength = words.associateWith { elem -> elem.length }
    println(withLength.keys) // [a, abc, ab, def, abcd]
    println(withLength.values) // [1, 3, 2, 3, 4]
    println(withLength) // {a=1, abc=3, ab=2, def=3, abcd=4}
}