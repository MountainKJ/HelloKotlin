package cn.learn.kt.function


//一个简单的函数,接收类型参数String 并返回 Unit（没有返回值）
fun printMessage(message: String): Unit {
    println(message)
}

//采用第二个可选参数作为默认值 Info。 返回类型被省略，实际上返回Unit
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//返回整数的函数
fun sum(x: Int, y: Int): Int {
    return x + y
}

//返回整数（推断值）的单一表达式函数
fun multiply(x: Int, y: Int) = x * y


//默认参数值和命名参数
fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))

    //中坠函数 关键字 infix
    infix fun Int.times(str: String)  = str.repeat(this)//在定义中扩展功能Int

    println(2 times "Bye ")                     //调用infix函数

    val pair  = "Ferrari" to "Katrina"          //Pair通过to从标准库调用infix函数来创建一个
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia

    //Operator Functions
    println(2 * "Bye ")
    val str ="Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

    //带vararg参数的功能,varargs 允许您通过使用逗号分隔参数来传递任意数量的参数
    println("带vararg参数的功能...【允许您通过使用\",\"分隔参数来传递任意数量的参数】")
    printAll("Hello", "Hallo","Salut", "Hola", "你好")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )
    log("1", "2", "3")
}
//vararg 关键字将一个参数成为可变参数
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    printAll(*entries)
}

//使用operator修饰符使infix函数更加方便
operator fun Int.times(string: String) = string.repeat(this)
operator fun String.get(range: IntRange) = substring(range)

class Person(val name: String) {
    val likePeople = mutableListOf<Person>()
    infix fun likes(other: Person) {likePeople.add(other)}
}