package cn.learn.kt.functional

//lambda函数是一种临时创建函数的简单方法，由于类型推断和隐私的it变量，在许多情况下可以非常简洁的表示Lambda
fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}

//lambda的所有荣耀，到处都是显示类型。Lambda是花括号中的部分，花括号被分配给变量类型（String）-> String(函数类型)
val upperCase1: (String) -> String = {str: String -> str.toUpperCase()}

//Lambda内部的类型推断：lambda参数的类型从为其分配的变量类型推断
val upperCase2: (String) -> String = {str -> str.toUpperCase() }

//在lambda之外进行类型推断，从lambda参数的类型和返回值推断变量的类型
val upperCase3 = {str: String -> str.toUpperCase()}

//这是错误的使用，编译器没有机会以这种方式推断类型
//val upperCase4 = {str-> str.toUpperCase()}

//对于具有单个参数的lambda，你不必显示命名，相反你可以使用隐世变量it，当it可以推断出类型时
val upperCase5: (String) -> String = {it.toUpperCase()}

//如果lambda由一个函数调用组成，则可以使用函数指针（::）
val upperCase6: (String) -> String = String::toUpperCase