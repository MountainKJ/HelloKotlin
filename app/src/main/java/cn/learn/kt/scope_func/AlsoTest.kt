package cn.learn.kt.scope_func

/**
 * also类似于apply：它执行给定的块并返回被调用的对象。
 * 在该块内部，该对象被引用it，因此更容易将其作为参数传递。此功能非常适合嵌入其他操作，例如登录呼叫链。
 */
fun main() {
    data class Person(val name: String, val age: Int, val about: String)
    fun toEat(person: Person) {
        println(person)
    }
    val jake = Person("Jake", 18, "Android开发")
        .also {
            toEat(it)       //调用将对象作为参数传递的日志记录函数。  it指向对象本身
        }
}