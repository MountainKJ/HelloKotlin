package cn.hello.kt

import android.content.Context
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

//fun main() {
//    GlobalScope.launch {                //在后台启动新的协程，并继续
//        delay(1000L)
//        println("The First coroutineScope")
//    }
//    println("Hello,")                   //主线程在此处立即继续运行
//    runBlocking {                       //次表达式会阻止主线程
//        delay(2000L)        //
//    }
//}

//fun main() = runBlocking {
//     launch {
//        delay(1000L)
//        println(" World!")
//    }
//    print("Hello,")
//}

//fun main() = runBlocking {
//    launch {
//        delay(200L)
//        println(" runBlocking 中的任务")
//    }
//
//    coroutineScope {//创建一个协程范围
//        launch {
//            delay(500L)
//            println("嵌套启动的任务")
//        }
//        delay(100L)
//        println("协程作用域中的任务")
//    }
//    println("协程作用域已经结束")
//}
//fun main() = runBlocking {
//    launch {
//        doWorld()
//    }
//    println(" Hello ")
//}
//
//suspend fun doWorld() {
//    delay(1000L)
//    println(" World!")
//}

//取消协程执行
//fun main() = runBlocking {
//    val job = launch {
//        repeat(1_000) { i ->
//            println("job: I'm sleeping $i ...")
//            delay(500L)
//        }
//    }
//    delay(1300L)
//    println("main: I'm tired of waiting!")
//    job.cancel()        //取消作业
//    job.join()          //等待作业完成
//    println("main: Now I can quit.")
//}

//取消合作
//fun main() = runBlocking {
//    val STARTTIME = System.currentTimeMillis()
//    val job = launch(Dispatchers.Default) {
//        var nextPrintTime = STARTTIME
//        var i = 0
//        //i>5会一直计算，调用cancelAndJoin 无效 & 【isActive 用于取消计算代码执行】 &【取消计算代码方式2  yield】
//        while (isActive) {
//            if(System.currentTimeMillis() >= nextPrintTime) {
//                println("job: I'm sleeping ${i++}")
//                nextPrintTime += 500L
//            }
//        }
//    }
//    delay(1300L)
//    println("main: I'm tired of waiting!")
//    job.cancelAndJoin()
//    println("main: Now I can quit")
//}

//fun main() = runBlocking {
//    val job = launch {
//       try {
//           repeat(1000) { i->
//               println("job: I'm sleeping $i ...")
//               delay(500L)
//           }
//       }finally {
//           //运行不可取消的块
//           withContext(NonCancellable) {
//               println("job: I'm running finally")
//               delay(1000L)
//               println("job: And I've just delayed for 1sec because I'm non-cancellable")
//           }
//       }
//    }
//    delay(1300L)
//    println("main: i tired waiting!")
//    job.cancelAndJoin()
//    println("main: Now I can quit.")
//}

//暂停
//fun main() = runBlocking {
//    //withTimeout 超时并抛出异常TimeoutCancellationException
//    //withTimeoutOrNull  则不会抛出异常
//    val result = withTimeoutOrNull(1300L) {
//        repeat(1000) {i ->
//            println("I'm sleeping$i....")
//            delay(500L)
//        }
//        "Done"
//    }
//    println("结果$result")
//}

//挂起
//fun main()  = runBlocking{
//    val time = measureTimeMillis {
//        val one = async { doSomethingUsefulOne() }
//        val two = async { doSomethingUsefulTwo() }
//        println("The answer is ${one.await() + two.await()}")
//    }
//    println("Completed in $time ms")

//    val time = measureTimeMillis {
//        //可以通过将异步start参数设置为CoroutineStart.LAZY来使其变得懒惰。
//        // 在这种模式下，只有在await要求其结果或调用了它Job的start函数时，它才启动协程
//        val one = async(start = CoroutineStart.LAZY) { doSomethingUsefulOne() }
//        val two = async(start = CoroutineStart.LAZY) { doSomethingUsefulTwo() }
//
//        one.start()
//        two.start()
//        println("答案是${one.await() + two.await()}")
//    }
//    println("在$time ms 中完成")
//
//    println(testMethod(endIndex = 2))
//}

//fun testMethod(startIndex: Int = 0, endIndex: Int = 3) : Int{

//    return startIndex + endIndex
//}

//fun main() {
//    val time = measureTimeMillis {
//        val one = somethingUsefulOneAsync()
//        val two = somethingUsefulTwoAsync()
//        //但等待结果必须涉及暂停或阻塞。
//        //在这里，我们使用`runBlocking {...}`来阻塞主线程，同时等待结果
//        runBlocking {
//            println("答案是${one.await() + two.await()}")
//        }
//    }
//    println("完成时间$time")
//}
//fun somethingUsefulOneAsync() = GlobalScope.async {
//    doSomethingUsefulOne()
//}
//
//fun somethingUsefulTwoAsync() = GlobalScope.async {
//    doSomethingUsefulTwo()
//}
//
//suspend fun doSomethingUsefulOne(): Int{
//    delay(1000L)
//    return 13
//}
//suspend fun doSomethingUsefulTwo(): Int{
//    delay(1000L)
//    return 29
//}

//协程上下文和调度程序
fun main() = runBlocking<Unit> {
    //当launch { ... }不带参数使用时，
    // 它将从要从其启动的CoroutineScope继承上下文（并因此继承调度程序）。在这种情况下，它继承runBlocking了main线程中运行的主协程的上下文
    launch {
        println("main run blocking   : I'm working in thread ${Thread.currentThread().name}")
    }

    //是一种特殊的调度程序，它似乎也在main线程中运行，但实际上，这是一种不同的机制，稍后将进行说明。
    launch(Dispatchers.Unconfined) {
        println("Unconfined   : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        println("Default   : I'm working in thread ${Thread.currentThread().name}")
    }

    val job = launch(newSingleThreadContext("MyOwnThread")) {
        println("MyOwnThread   : I'm working in thread ${Thread.currentThread().name}")
    }
    job.cancelAndJoin()
}