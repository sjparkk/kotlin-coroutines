package org.kotlincoroutines

import kotlinx.coroutines.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCoroutinesApplication

fun main(args: Array<String>) = runBlocking {
    launch {
        doWorld()
    }
    println("Hello,")
}

//코루틴 내부에서 실행되는 중단 함수는 suspend 키워드를 함수명 앞에 붙여 만들 수 있다.
suspend fun doWorld() {

    //일반 함수와 달리 호출 가능
    delay(1000L)
    println("World!")
}