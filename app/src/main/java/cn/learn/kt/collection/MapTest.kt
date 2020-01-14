package cn.learn.kt.collection

const val POSITION_X_PASS: Int = 15

val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)       //创建一个可变的map
val EZPassReport: Map<Int, Int> = EZPassAccounts                                            //创建一个只读的map

fun updatePointsCredit(accountId: Int) {
    if(EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POSITION_X_PASS
    }else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach{
        k, v -> print("ID $k: credit $v\t")
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()

    val map = mapOf("key" to 42)
    val value1 = map["key"]
    val value2 = map["key2"]
    val value3: Int = map.getValue("key")
    val mapWithDefault = map.withDefault { it.length }
    val value4 = mapWithDefault.getValue("key2")

    println()
    println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
    println("1111 -> $value1")
    println("2222 -> $value2")
    println("3333 -> $value3")
    println("4444 -> $value4")
    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {       // NoSuchElementException因为"anotherKey"不在地图中而抛出。
        println("Message: $e")
    }

}