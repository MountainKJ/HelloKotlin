package cn.learn.kt.collection

//flatMap将集合的每个元素转换为
// 可迭代的对象，并构建转换结果的单个列表。转换是用户定义的。
fun main() {
    val numbers = listOf(1,2,3)                                 //定义数字的集合
    val tripled = numbers.flatMap { listOf(it, it,it) }         //建立一个列表，其中每个集合元素都重复三遍。重要的是，它不是列表列表；这是一个有九个元素的整数列表。

    println(tripled)
}