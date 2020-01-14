package cn.learn.kt.collection


fun  main() {
    val numbersAAN = listOf(1,-2,3,-4,5,-6)
    //any 如果集合包含至少一个与给定的条件匹配的元素，就会返回true
    println("原list：$numbersAAN")

    val anyNegative = numbersAAN.any { it < 0 }
    val anyGT6 = numbersAAN.any { it > 6 }
    println("any -> it<0：$anyNegative")
    println("any -> it>6：$anyGT6")

    //all 如果集合中所有的元素都满足条件，才返回true
    val allEven = numbersAAN.all { it % 2 == 0 }
    val allLess6 = numbersAAN.all { it < 6 }
    println("all -> it % 2 == 0 $allEven")
    println("all -> it < 6 $allLess6")

    //none 如果集合中没有与给定谓词匹配的元素，则函数none返回 true
    val allEven2 = numbersAAN.none { it % 2 == 1 }
    val allLess62 = numbersAAN.none { it > 6 }
    println("none -> it % 2 == 1 $allEven2")
    println("none -> it > 6 $allLess62")

}