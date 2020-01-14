package cn.learn.kt.scope_func

import kotlin.coroutines.Continuation

/**
 * with 是一个非扩展函数，可以简洁的访问其参数的成员：在其引用其成员时，可以省略实例名称
 * */
fun main() {

    class Configurations(val host: String, val port: String)

    val configuration = Configurations("192.168.8.68", "8888")
    with(configuration) {
        println("$host:$port")
    }

// instead of:
    println("${configuration.host}:${configuration.port}")
}