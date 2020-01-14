package cn.learn.kt.collection

/**
 * partition函数使用给定的谓词将原始集合分为几对列表： 谓词为的元素true。 谓词所在的元素false
 */
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val evenOdd = numbers.partition { it % 2 == 0 }

    val evenOdd2 = numbers.partition { it > 0 }

    println("----------------------numbers.partition { it % 2 == 0 }-----------------------")
    println(evenOdd)
    println("----------------------numbers.partition { it > 0 }-----------------------")
    println(evenOdd2)
}