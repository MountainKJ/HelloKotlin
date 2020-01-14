package cn.learn.kt.collection

//过滤器可以过滤集合，使用一个过滤谓词作为lambda参数

val numbers = listOf(1,-2,3,-4,5,-6)

val positives = numbers.filter { it > 0}

val negatives = numbers.filter { x -> x < 0 }

fun main() {
    println("原始集合$numbers")
    println("过滤大于0后$positives")
    println("过滤小于0后$negatives")
}