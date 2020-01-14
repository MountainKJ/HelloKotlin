package cn.learn.kt.collection

// min和max函数返回的最小集合的最大元素。如果集合为空，则返回null。
fun main() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min = ${numbers.min()} max = ${numbers.max()}") // 1
    println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")        // 2
}