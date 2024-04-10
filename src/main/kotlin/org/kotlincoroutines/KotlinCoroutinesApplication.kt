package org.kotlincoroutines

import kotlinx.coroutines.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinCoroutinesApplication

fun main(args: Array<String>) = runBlocking { //코루틴 안에서는 runBlocking{} 의 사용은 권장 되지 않으며, 일반 적인 함수 코드 블록에서 중단 함수를 호출할 수 있도록 하기 위해 사용

    //runBlocking{} 코루틴 빌더등을 이용해 생성 된 코루틴 블록 안에서 launch{} 코루틴 빌더를 이용하여 새로운 코루틴을 생성하면 현재 위치한 부모 코루틴에 join()을 명시적으로 호출할 필요 없ㅇ이 자식 코루틴들을 실행하고 종료될 때까지 대기 할 수 있음
    launch {
        delay(200L)
        println("Task from runBlocking")
    }

    //runBlocking{}와 달리 coroutineScope{} 는 자식들의 종료를 기다리는 동안 현재 스레드를 블록하지 않음
    coroutineScope {
        launch {
            delay(500L)
            println("Task from nested launch")
        }
        delay(100L)
        println("Task from coroutine scope")
    }
    println("Coroutine scope is over")

    /**
    결과
    Task from coroutine scope
    Task from runBlocking
    Task from nested launch
    Coroutine scope is over
     */
}
