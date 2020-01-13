package cn.learn.kt.variables

fun main() {
    //声明一个可变变量并对其进行初始化
    var a: String = " initial"
    println(a)
    //声明一个不可变变量并初始化
    val b: Int = 1
    //声明一个不可变变量，由编译器推断类型Int
    val c = 3

    val d: Int
    if(c > 2) {
        d = 3
    }else {
        d = 2
    }

}