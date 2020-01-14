package cn.learn.kt.collection

fun main() {
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    val first = words.find { it.startsWith("some") }            //找到第一个以“some”开头的单词
    val last = words.findLast { it.startsWith("some") }         //找到最后一个以“some”开头的单词
    val nothing = words.find { it.contains("nothing") }         //找到第一个包含“nothing的单词”，没有则返回null

    println(words)
    println("find -> startWith(some):$first")
    println("findLast ->startWith(some):$last")
    println("find -> startWith(nothing):$nothing")
}