package cn.learn.kt.special

import java.util.*


/**
 * Kotlin 中类和对象的工作方式与大多数面向对象的语言相同，类是蓝图，而对象时类的实例
 * 通常定义一个类，创建多个实例
 * */

class LuckDispatcher {
    fun getNumber() {
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrice(1, 3, 5)

    DeAuth.takeParams("foo", "123456")

    println("Companion 关键字测试:")
    BigBen.getBonges(10)

}

//伴生对象,关键字Companion  类似java中的静态方法   使用对象名称调用对象成员
class BigBen{
    companion object Bonger{
        fun getBonges(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG\t")
            }
        }
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    //这是object函数式的基本典型用法：简单的对象、属性结构  在类声明中不需要这样做：创一个一个对象，
    //声明其成员变量并在一个函数中访问它。像这样的对象通常在Java中作为匿名类实例创建
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special
    println("Total price:$$total")
}

object DeAuth {
    fun takeParams(userName: String, password: String) {
        println("input Auth parameters = $userName:$password")
    }
}
