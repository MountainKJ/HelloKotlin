package cn.learn.kt.control

fun main() {
//    cases("Hello")
//    cases(1)
//    cases(1L)
//    cases(MyClass())
//    cases("hello")


    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when(obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass
fun cases(obj: Any) {
    when(obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}