package com.example.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/**        //Light Weightness
        GlobalScope.launch {
            repeat(100_000){
                launch {
                   println("Android")
                }
            }
        }
 */
        //Scope
        //Global scope
        //Run Blocking -> işlem bitene kadar sonraki bloklar durur
        //Coroutine Scope -> En çok kullanacağımız scope


/**        //Runblocking
        println("run blocking start")
        runBlocking {
            launch {
                delay(5000)
                println("run blocking")
            }
        }
        println("run blocking end")*/


/**        //Global Scope
        println("Global scope start")
        GlobalScope.launch {
            delay(5000)
            println("Global Scope")
        }
        println("Global Scope end")*/


        //Coroutine Scope Dispatchers.Default -> CoroutineContext'dir
        //Coroutine scope ile scope'un hangi thread'de çalışabildiğimizi secebiliyoruz
/**
        println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            println("coroutine scope")
            delay(5000)
        }
        println("coroutine scope end")
*/

        //Dispatchers -> Hangi thread ile coroutines çalışacak onu belirler

        /** Dispatchers.Default -> Cpu Intensive -> Cpu yoğun işlerde kullanılır
         * (Çok yoğun bir diziyi işleme, çok büyük bir fotoyu işleme
         */

        /** Dispatchers.IO -> Input/Output, Networking
         * Internetten veri cekerken kullanılır
         */

        /** Dispatchers.Main -> UI Thread
         */

        /**Dispatchers.Unconfined -> Nerden çağırıldıysa orayı miras alır (Inherited Dispatcher)
         *
         */

        runBlocking {
            launch(Dispatchers.Main) {
                println("Thread:  ${Thread.currentThread().name} ")
            }

                launch(Dispatchers.IO) {
                    println("Thread:  ${Thread.currentThread().name} ")
                }


                launch(Dispatchers.Unconfined) {
                    println("Thread:  ${Thread.currentThread().name} ")
                }


                launch(Dispatchers.Default) {
                    println("Thread:  ${Thread.currentThread().name} ")
                }

        }


        /**
        runBlocking {
        launch {
        delay(5000)
        println("run blocking")
        }

        coroutineScope {
        launch {
        delay(3000)
        println("Coroutine scope")
        }
        }

        }
         */


    }

}