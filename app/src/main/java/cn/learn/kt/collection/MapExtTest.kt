package cn.learn.kt.collection

val numbersExt = listOf(1,-2,3,-4,5,-6)

val doubled = numbersExt.map { x -> x*2 }

val tripled = numbersExt.map { it * 3 }

fun main() {
    println("变换前的list $numbersExt")
    println("所有元素 * 2变换后$doubled")
    println("所有元素 * 3的变换$tripled")
}