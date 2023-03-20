package com.example.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //Job -> kontrol edilebilen launch'lara denir

    runBlocking {
       val myJob =  launch {
            delay(2000)
            println("Job")
           val mySecondJob= launch {
               println("job 2")
           }
        }
        myJob.invokeOnCompletion {
            println("myjob is ended")
        }

        myJob.cancel()
    }
}