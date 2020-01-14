package cn.learn.kt.delegation

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Kotlin提供了一种委派属性的机制，
 * 该机制允许将属性set和get方法的调用委派给某个对象。在这种情况下，委托对象应具有方法getValue。对于可变属性，您还需要setValue。
 */

class Example{
    var p: String by Delegate()                         //p将属性String 委托给class Delegate， 委托对象在by关键字之后定义
    override fun toString() = "Example Class"
}
class Delegate{
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String{       //委托方法，这些方法的实现始终如示例中所示，实现可能包含您需要的任何步骤，对于不可变属性，仅getValue是必须的
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}
//lazy延迟初始化
class LazySample{
    init {
        println("created!")
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
}

//属性委派可用于在map中存储属性，这对于诸如解析JSON 或执行其他“动态”工作之类的任务非常方便

class User(map: Map<String, Any?>){
    val name: String by map     //代表map通过字符串建-属性名 从中获取值
    val age: Int by map         //同上
    //备注  也可以将可变属性委派给map， 这种情况，map将根据属性分配进行修改，请注意使用MutableMap
}
fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"

    //lazy observable 和else
    val sample = LazySample()                //lazy 未初始化的对象创建
    println("lazyStr = ${sample.lazyStr}")//第一次调用get（）执行lazy（）作为参数传递的lambda表达式，并保存结果
    println(" = ${sample.lazyStr}")         //进一步调用以get返回保存的结果，如果你希望线程安全，请改用blockingLazy（），确保在一个线程中计算值，并保证所有线程看到相同的值

    //属性委派测试
    val user = User(mapOf(
        "name" to "John",
        "age" to 18
    ))
    println("name = ${user.name}, age = ${user.age}")
}