package cn.learn.kt.collection
//sorted 返回根据其自然排序顺序（升序）排序的集合元素的列表。
//sortedBy 根据指定选择器函数返回的值的自然排序顺序对元素进行排序。
fun main() {
    val shuffled = listOf(5,4,3,1,2)
    val natural = shuffled.sorted()     //按自然顺序对其进行排序。
    println("-----------------------sorted--------------------")
    println(natural)
    val inverted = shuffled.sortedBy { -it }//通过-it用作选择器函数以自然倒序对它进行排序。
    println("-----------------------sortedBy { -it }--------------------")
    println(inverted)

    val words = listOf('a','c','b','d')
    println(words.sorted())

    val strs = listOf("爱好", "艹", "不咯好")
    println(strs.sortedBy{-it.length})
}