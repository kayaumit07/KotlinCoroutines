package com.example.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    var userName=""
    var userAge=0

    runBlocking {

        val downloadedName= async {
            downloadName()
        }


        val downloadedAge= async {
            downloadAge()
        }


        userName= downloadedName.await()
        userAge=downloadedAge.await()

        println("$userName $userAge")


    }

}

suspend fun downloadName():String{
    delay(2000)
    val userName="Umit"
    println("username download")
    return userName
}

suspend fun downloadAge():Int{
    delay(5000)
    val userAge=60
    println("username download")
    return userAge
}