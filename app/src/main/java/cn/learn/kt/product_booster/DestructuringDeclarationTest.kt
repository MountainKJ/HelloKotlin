package cn.learn.kt.product_booster

/**
 * 破坏声明
 * 破坏声明语法非常方便，尤其是当您只需要一个实例来访问其成员时。它使您可以定义实例而无需使用特定名称，从而节省了几行代码。
 */
fun main() {

    val (x,y,z) = arrayOf(5,10,15)
    println(x)
    println(y)
    println(z)

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {
        println("$name:$age")
    }

    data class User(val userName: String, val email: String)

    fun getUser() = User("Mary", "mary@somewhere.com")

    val user = getUser()
    val (userName, _) = user                //如果不需要这些值之一，请使用下划线，以避免编译器提示指示未使用的变量。
    println(userName == user.component1())

    val (_, emialAddress) = getUser()
    println(emialAddress)

    class Pair<K, V>(val first: K, val second: V){      //Pair使用component1()和component2()方法定义自定义类。
        operator fun component1(): K {
            return first
        }

        operator fun component2(): V {
            return second
        }
    }

    val (num, name) = Pair(1, "one")        //以与Built-in相同的方式来解构此类的实例Pair。

    println("num = $num\t name = $name")
}