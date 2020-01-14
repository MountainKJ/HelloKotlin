package cn.learn.kt.product_booster

/**
 * 与大多数其他编程语言（Java，C ++等）一样，Kotlin支持根据定义的顺序将参数传递给方法和构造函数。Kotlin还支持命名参数，
 * 以允许更清晰的调用并避免参数顺序出错。这样的错误很难找到，因为例如两个连续的参数具有相同的类型时，编译器就不会检测到它们。
 */
fun main() {
    println(format("Mario", "example.com"))         //调用带有参数值的函数
    println(format("domain.com", "username"))       //调用带有切换参数的函数，
    println(format(name = "foo", domain = "bar.com"))               //调用带有命名参数的函数
    println(format(domain = "frog.com", name = "pepe"))             //使用命名实参调用函数时,可以任意顺序指定他们
}

fun format(name: String, domain: String)  = "$name@$domain"
