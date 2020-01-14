package cn.learn.kt.collection

//zip函数将两个给定的集合合并到一个新的集合中。默认情况下，结果集合包含Pairs具有相同索引的源集合元素。但是，您可以定义结果收集元素的自身结构。
//结果集合的大小等于源集合的最小大小。

fun main() {
    val a = listOf(" a", " b", " c")
    val b = listOf(1,2,3,4)
    val c = listOf(6,7,8,9)

    val resultPairs = a zip b
    val resultReduce = a.zip(b){a,b -> "$a $b"}
    val resultReduce2 = a.zip(b)

    println("resultPairs----$resultPairs")
    println("resultReduce----$resultReduce")
    println("resultReduce2----$resultReduce2")
    println("同类型 zip----${b zip c}")

}