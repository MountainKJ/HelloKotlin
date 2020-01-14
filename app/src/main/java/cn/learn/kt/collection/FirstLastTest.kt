package cn.learn.kt.collection

/**
 * 这些函数相应地返回集合的第一个和最后一个元素。
 * 您也可以将它们与谓词一起使用。在这种情况下，它们返回与给定谓词匹配的第一个或最后一个元素。
 */
fun main() {
    val numbers = listOf(1,-2,3,-4,5,-6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { i-> i % 2 == 0 }
    val lastEven = numbers.last { it % 2 != 0 }

    println(numbers)
    println("第一个元素为$first")
    println("最后一个元素为$last")
    println("满足条件 i % 2 == 0 的第一个元素为$firstEven")
    println("满足条件 it % 2 != 0的最后一个元素为$lastEven")

//    firstOrNull， lastOrNull
//    这些函数几乎以相同的方式工作，但有一个区别：如果没有匹配的元素，它们将返回null。

    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val firstON = empty.firstOrNull()
    val lastON = empty.lastOrNull()
    val firstF = words.firstOrNull{ it.startsWith('f')}
    val firstZ = words.firstOrNull{ it.startsWith('z')}

    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println(words)
    println("firstON -> $firstON")
    println("lastON -> $lastON")
    println("firstF -> $firstF")
    println("firstZ -> $firstZ")
    println("lastF -> $lastF")
    println("lastZ -> $lastZ")

}