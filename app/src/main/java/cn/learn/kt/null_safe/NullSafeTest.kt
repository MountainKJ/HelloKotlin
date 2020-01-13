package cn.learn.kt.null_safe

fun main() {
    //声明一个非null String的变量
    var neverNull: String = "this can't be null"
    //neverNull = null  //尝试分配null给非空变量时，将产生编译错误

    //声明一个可为空的String变量
     var nullable: String? = "You can keep a null here"
    nullable = null     //将null值分配给空null变量，编译通过

    //编译器推断非空
    var inferredNonNull = "This compiler assumes non-null"
//    inferredNonNull = null    //尝试分配null给具有推断类型的变量时，编译错误

    //声明带有非null字符串参数的函数
    fun strLength(notNull: String): Int{
        return notNull.length
    }

    //用非空String参数调用，编译通过
    strLength(neverNull)
//    strLength(nullable)   //用String?参数调用改函数，编译错误

    //接收可为空的字符串并返回其描述函数
    fun describeString(maybeString: String?): String{
        return if(maybeString != null && maybeString.isNotEmpty()) {
            //给定字符串不为空返回长度信息
            "String of length ${maybeString.length}"
        }else {
            //否则告诉调用者字符串为空或者null
            "Empty or null String"
        }
    }
}