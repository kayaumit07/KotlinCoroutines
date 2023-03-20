package com.example.kotlincoroutines

import kotlinx.coroutines.*

fun main(){
    //Suspend Fonksiyonlar içerisinde coroutine çalıştırılabilen fonk.'dur


    runBlocking {
        delay(2000)
        println("run blocking")
        myFunc()
    }
}

suspend fun myFunc(){
    coroutineScope {
        delay(5000)
        println("suspend func")
    }
}