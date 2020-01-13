package cn.learn.kt.functional

fun main() {
    val sumResult = calculate(4, 5, ::sum)          //调用传递两个整数值和function参数的高阶函数::sum  ::在kotlin中式按名称引用函数的表示法
    val mulResult = calculate(4, 5){a,b -> a * b}   //调用传入lambda作为函数参数的高阶函数。看起来更清晰，不是吗？
    val cfaResult = calculate(6,3, ::cfa)

    println("sumReslut $sumResult, mulResult $mulResult, cfaResult $cfaResult")

    val func = operation()      //调用返回函数的高阶函数operation
    println(func(2))            //调用该func,该square功能实际上已执行
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  //1、声明一个高阶函数，它使用两个整数参数x和y，此外，他将另一个函数operation作为参数，声明中还定义了参数和返回类型
    return operation(x, y)      //高阶函数operation使用提供的参数返回调用结果
}

fun sum(x: Int, y: Int) = x + y //声明一个和opertion签名匹配的函数

fun cfa(x: Int, y: Int) = x / y

fun operation():(Int) -> Int{       //声明一个返回函数的高阶函数

    return ::square
}

fun square(x: Int) = x * x      //声明一个与签名匹配的函数



