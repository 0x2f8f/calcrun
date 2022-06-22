package main.lessons

fun main() {
    val arr = arrayOf("Ivanov", "Ivan", "Ivanovich")
    printArr(arr)

    val nums = intArrayOf(4, 5, 6)
    double(nums)
    println("Значение в функции main: ${nums[0]}")
}

fun positionInArr(position: Int, nums: Array<Int>): Int {
    return nums[position];
}

fun issetWordInArr(word: String, words: Array<String>): Boolean {
    return word in words;
}

fun issetNumInArr(num: Int, nums: IntArray): Boolean {
    return num in nums
}

fun printArr(words: Array<String>) {
    for (i in words.indices) {
        println(words[i])
    }
}
fun double(numbers: IntArray){
    numbers[0] = numbers[0] * 2
    println("Значение в функции double: ${numbers[0]}")
}