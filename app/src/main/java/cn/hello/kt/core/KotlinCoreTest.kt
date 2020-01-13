package cn.hello.kt.core

fun main() {
    var str = "Hello"
    println("$str .length = ${str.length}")

    //不可空类型，使用前必须初始化
    var notCalNullInt: Int = 0
    //可空类型
     var canNullInt: Int? = null
    //安全访问
    println("${canNullInt?.toShort()}")
    //避免空值 为空给与一个默认值
    val age = canNullInt ?: 18
    println("$age ")
    //为空返回
//    val time = canNullInt ?: return


    //延迟加载，在变量真正被需要的时候才被初始化
    val i:Int by lazy { 5 }
    println("i = $i")

    //【0,10】
    for (i in 0..10) {
        print("$i\t")
    }

    println()
    //【10,0】
    for (i in 10 downTo 0) {
        print("$i\t")
    }

    println()
    //【跳步 2】
    for (i in 0..10 step 2) {
        print("$i\t")
    }

    println()
    //[0,10)
    for (i in 0 until 10) {
        print("$i\t")
    }

    println()
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((k,v) in map) {
        print("$k - $v\t")
    }

    //强大易用的迭代器
    println()
    println("list 遍历:")
    val list = listOf(1,2,3,4,5,6,7,8,9)
    list.forEach{ print(it)    }
    println()
    println("list映射：")
    val listUp = list.map { it+2 }
    listUp.forEach{ print(it)}
    println()
    println("过滤 where %2 == 0：" )
    val listFilter = list.filter { it % 2 == 0 }
    listFilter.forEach{ print(it)}
    // asSequence 懒处理 map filter中都存在遍历操作 asSequence可以将它们合并起来 只存在一次遍历 提升性能
    println()
    println("一次遍历，性能提升(元素value + 2) && %2 == 0")
    val listMore = list.asSequence().map { it + 2 }.filter { it % 2 == 0 }.toList()
    listMore.forEach { print(it) }
    //
    println()
    println("默认参数示例：")
    println("${addNumber(2, 3)}")

    println()
    println("data Class 示例：")
    val user = User("张三", 16, 1)
    println("name = ${user.name}\t age = ${user.age}\t 性别：${user.sex}")

    val str2 = "a"
    val res = str2.run {
        println(length)
        1
    }

}

//默认参数
fun addNumber(startCount: Int = 3, endCount: Int = 5) : Int {
    return startCount + endCount
}

