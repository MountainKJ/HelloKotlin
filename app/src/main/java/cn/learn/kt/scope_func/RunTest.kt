package cn.learn.kt.scope_func

/***
 * 像let一样  run是标准库中的另一个作用域函数，基本上它执行相同的操作，执行代码块并返回其结果
 *  区别：run对象内部可以通过this进行访问，当您要调用对象的方法而不是将其作为参数传递时，很有用
 */
fun main() {

    fun getNullableLength(ns: String?) {
        println(ns)

        ns?.run {
            //this 指向对象本身
            println("this is null?"+isEmpty())
            println("tlength = $length")
            length              //返回此属性
        }
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string whit kotlin")
}

