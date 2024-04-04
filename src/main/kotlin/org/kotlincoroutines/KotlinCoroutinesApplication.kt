package org.kotlincoroutines

import kotlinx.coroutines.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCoroutinesApplication

@OptIn(DelicateCoroutinesApi::class)
fun main(args: Array<String>) = runBlocking { //코루틴 안에서는 runBlocking{} 의 사용은 권장 되지 않으며, 일반 적인 함수 코드 블록에서 중단 함수를 호출할 수 있도록 하기 위해 사용

    //GlobalScope.launch = 코루틴을 생성하기 위한 코루틴 빌더
    GlobalScope.launch {
        delay(1000L)
        println("World!")
    }

    println("Hello,")
    //코루틴 안에서만 사용 가능
    delay(2000L)
}
