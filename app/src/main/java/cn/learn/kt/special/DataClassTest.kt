/**
 * 数据类使创建存储值的类变得容易，自动提供了用于复制，获取字符串表示形式 以及在集合中使用实例的方法
 *
 */
fun main() {
    val user = User("张三", 1001)
    println(user)

    val secondUser = User("张三", 1001)
    val thridUser = User("王五", 1003)
    println("user == secondUser: ${user == secondUser}")
    println("user == thidUser: ${user == thridUser}")

    println("user.hashCode=${user.hashCode()}")
    println("thirdUser.hashCode = ${thridUser.hashCode()}")

    println("copy function:")
    println(user.copy())
    println(user.copy(id = 2))
    println(user.copy("max"))


    println("name = ${user.component1()}")
    println("id = ${user.component2()}")            //自动声明的componentN()函数使您可以按声明顺序获取属性的值
}

//使用data 关键字定义数据类
data class User(val name: String, val id: Int)
