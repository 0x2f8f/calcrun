package main.lessons.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


suspend fun main() {
    work(1, 4, 400L)
    println("Hello Coroutines Last")
}

suspend fun work(f: Int, n: Int, d: Long) = coroutineScope {
    launch {
        for (i in f..n) {
            println(i)
            delay(d)
        }
    }
}