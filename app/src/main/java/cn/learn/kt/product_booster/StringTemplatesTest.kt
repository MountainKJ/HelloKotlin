package cn.learn.kt.product_booster

import java.util.*

/**
 * 字符串模板允许您将变量引用和表达式包含在字符串中。当请求字符串的值时（例如by println），所有引用和表达式都将替换为实际值。
 */
fun main() {

    val greeting = "Kotliner"
    println("Hello $greeting")
    println("Hello ${greeting.toUpperCase(Locale.getDefault())}")
}