package cn.learn.kt.collection
//getOrElse提供对集合元素的安全访问。它需要一个索引和一个函数，以在索引超出范围时提供默认值。

fun main() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1){42})  //在此处打印索引1元素。
    println(list.getOrElse(10){42}) //42由于索引10超出范围而打印。

    //getOrElse也可以用于Map获取给定键的值。
    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x"){1})  //打印默认值1，因为键"x"不在地图上。

    map["x"] = 3
    println(map.getOrElse("x"){1})      //打印3键的值"x"。

    map["x"] = null
    println(map.getOrElse("x"){1})  //打印默认值，因为"x"未定义键的值
}
