package main.lessons.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch{
        for(i in 0..5){
            delay(400L)
            println(i)
        }
    }

    println("Hello Coroutines First")
}