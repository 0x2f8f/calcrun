package main.lessons.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope<Unit> {
    launch {
        doWork(1, 5, 400L)
    }

    launch {
        doWork(10, 15, 200L)
    }
}

suspend fun doWork(f: Int, n: Int, d: Long) {
    for (i in f..n) {
        println(i)
        delay(d)
    }
}