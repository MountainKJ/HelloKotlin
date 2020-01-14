package cn.learn.kt.scope_func

/**
 * kotlin标准库功能let可用于域和null检查，在对象上调用时，let执行给定的代码块并返回其最后一个表达式的结果
 */
fun main() {
    val empty = "test".let {        //在test的结果上调用给定的块
        print(it)
        it.isEmpty()                //let返回此表达式的结果
    }
    println(" is empty:$empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {      //使用安全调用，因此let其代码块将仅在非空值上执行
            print("\t")
            print(it)
            println()
        }
    }
    printNonNull(null)
    printNonNull("my string")

}