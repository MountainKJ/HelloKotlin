package cn.learn.kt.collection

/**
 * MutableList(可变) 或 只读的（List）
 *   create：
 *      listof（）用于只读列表
 *      mutableListOf()可变列表
 *      为防止不必要的修改，请通过将可变列表转换为来获取可变列表的只读视图List
 * */

val systemUsers: MutableList<Int> = mutableListOf(1,2,3)            //创建一个MutableList
val sudoers: List<Int> = systemUsers                                //创建列表的只读视图
fun addSudoer(newUser: Int) {                                       //添加新项目MutableList
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                    //返回不可变的函数List
    return sudoers
}

fun main() {
    addSudoer(4)                                        //更新MutableList。由于所有相关的只读视图都指向同一对象，因此它们也会更新。
    println("Tot sudoers: ${getSysSudoers().size}")                 //检索只读列表的大小。

    getSysSudoers().forEach {
        i -> println("Some userful info on user $i")
    }
}