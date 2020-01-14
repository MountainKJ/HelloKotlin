package cn.learn.kt.collection

/**
 *  Set是一个无序集合，不支持重复 create setOf/mutableSetOf()
 * */

val openIssues: MutableSet<String> = mutableSetOf("aq1","aq2","aq3")

fun addIssues(aqDesc: String): Boolean {
    return openIssues.add(aqDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if(isAdded) "registered correctly" else "marked as duplicate and rejected"
}

fun main() {
    val aNewIssue: String = "aq4"
    val anIssueAlreadyIn: String = "aq2"        //结果会失败

    println("Issue $aNewIssue ${getStatusLog(addIssues(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssues(anIssueAlreadyIn))}")
}