package cn.learn.kt.control

fun main() {
    val cakes = listOf(1, 2, 3, 4,5, 6)
    for (i in cakes) {
        print("$i\t")
    }

    println()
    println("While 循环。。。")
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    println("do While 循环。。。")
    do {
        bakeACake()
        cakesBaked++
    }while (cakesBaked < cakesEaten)

    println()
    println("iterators demo..")
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (i in zoo) {
        println("Watch out, it's a ${i.name}")
    }
}

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
    //在类中实现iterator运算符来定义自己的迭代器 关键字 operator
    operator fun  iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")
