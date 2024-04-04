package org.kotlincoroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCoroutinesApplication

@OptIn(DelicateCoroutinesApi::class)
fun main(args: Array<String>) {

    //GlobalScope.launch = 코루틴을 생성하기 위한 코루틴 빌더
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }
    println("Hello,")
//    Thread.sleep(2000L)
}
