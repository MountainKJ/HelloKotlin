package cn.learn.kt.control

//if 用作表达式替换 三木表达式
fun main() {
    fun max(a: Int, b: Int) = if(a>b) a else b

    println(max(99,40))
}