package cn.learn.kt.generics

class MutableStack<E>(vararg items: E) {            //定义一个通用类，E称为通用类型参数
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }
}

//如果函数的逻辑与特定类型无关，则 还可以生成函数
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
fun main() {

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}