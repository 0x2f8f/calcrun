package main.lessons

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

fun main() {
    val arr = arrayOf("Ivanov", "Ivan", "Ivanovich")
    printArr(arr)
}