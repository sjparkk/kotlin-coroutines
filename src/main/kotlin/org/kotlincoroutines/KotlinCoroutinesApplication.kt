package org.kotlincoroutines

import kotlinx.coroutines.*
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

    //runBlocking 블록은 주어진 블록이 완료될 때까지 현재 스레드를 멈추는 새로운 코루틴을 생성하여 실행하는 코루틴 빌더 (명시적으로 스레드를 멈추게 할 수 있다는 것도 나타냄)
    runBlocking {
        delay(2000L)
    }

    //Suspend function 'delay' should be called only from a coroutine or another suspend function
    //delay(2000L)
}
