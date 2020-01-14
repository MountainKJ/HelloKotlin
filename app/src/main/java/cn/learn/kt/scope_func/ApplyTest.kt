package cn.learn.kt.scope_func

/**
 * apply在对象上执行代码块并返回对象本身。在块内部，该对象由引用this。 此功能对于初始化对象非常方便
 */
fun main() {
    class Person {
         var name: String? = null
         var age: Int? = null
         var about: String? = null
        override fun toString(): String {
            return "$name\t $age\t$about"
        }
    }
    val jake = Person()
    val stringDescription = jake.apply {
        //返回对象本身
        name = "张三"
        age = 18
        about = "from Chongqing"
    }.toString()

    println(stringDescription)
}