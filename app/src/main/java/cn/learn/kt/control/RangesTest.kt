package cn.learn.kt.control

fun main() {
    println("in 0..3")
    for(i in 0..3) {
        print("$i\t")
    }

    println()
    println("i in 2..8 step 2")
    for (i in 2..8 step 3) {
        print("$i\t")
    }

    println()
    println("i in 3 downTo 0")
    for (i in 3 downTo 0) {
        print("$i\t")
    }

    println()
    println("i in 0 until 10")
    for (i in 0 until 10) {
        print("$i\t")
    }

    println()
    println("c in 'a'..'d'")
    for (c in 'a'..'d') {
        print("$c\t")
    }

    println()
    println("c in 'z' downTo 's' step 2")
    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }

    println()
    println("if 条件内使用 x in 1..10")
    val x = 2
    if(x in 1..10) {
        print(x)
    }

    println()
    println("!in")
    if(x !in 10..40) {
        println("不在范围内")
    }
}