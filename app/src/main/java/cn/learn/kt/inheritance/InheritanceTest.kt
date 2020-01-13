package cn.learn.kt.inheritance

//kotlin类 默认为final 要允许继承 使用open关键字标记该类
open class Dog {
    //默认情况下方法也是final的 要重写也需要使用open关键字修饰
    open fun sayHello() {
        println("wow wow")
    }
}

//当你在类：SupperClassName()的名称后指定超级类时， 该类将继承超累，空括号（）表示对超类默认构造函数的调用
class Yorkshire: Dog() {
    //覆盖方法或属性需要override修饰符
    override fun sayHello() {
        println("wif wif")
    }
}

//参数化构造函数的继承
open class Tiger(private val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh")
    }
}

//如果要在创建子类时用超类的参数化构造函数， 请在子类声明中提供构造函数参数
class SiberianTiger: Tiger("Siberia")


/**将构造函数参数传递给超类*/
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, 来自$origin 的狮子说：graoh!")
    }
}

//name 在 Asiatic 声明中既不是 var 也不是 val 它是一个构造函数参数，其值传递给超类的name
class Asiatic(name: String) : Lion(name = name, origin = " India ")
fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}