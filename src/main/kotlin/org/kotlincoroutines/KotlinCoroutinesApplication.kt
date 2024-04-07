package org.kotlincoroutines

import kotlinx.coroutines.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCoroutinesApplication

@OptIn(DelicateCoroutinesApi::class)
fun main(args: Array<String>) = runBlocking { //코루틴 안에서는 runBlocking{} 의 사용은 권장 되지 않으며, 일반 적인 함수 코드 블록에서 중단 함수를 호출할 수 있도록 하기 위해 사용

    //GlobalScope.launch = 코루틴을 생성하기 위한 코루틴 빌더
    val job = GlobalScope.launch {
        delay(1000L)
        println("World!")
    }

    println("Hello,")

    //Job 인스턴스를 통해 작업 완료 대기
    job.join()
}
