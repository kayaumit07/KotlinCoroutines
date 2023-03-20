package com.example.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(){
    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread ${Thread.currentThread().name} ")
        }
    }
    runBlocking {
        launch(Dispatchers.IO) {
            println("IO Thread ${Thread.currentThread().name} ")
        }
    }
    runBlocking {
        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread ${Thread.currentThread().name} ")
        }
    }
    runBlocking {
        launch(Dispatchers.Default) {
            println("Default Thread ${Thread.currentThread().name} ")
        }
    }
}
