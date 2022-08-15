package main.lessons.coroutine

import kotlinx.coroutines.*

suspend fun main() = coroutineScope{
    launch{
        println("Outer coroutine (2)")
        launch{
            println("Inner coroutine (3)")
            delay(400L)
        }
    }

    println("End of Main (1)")
}