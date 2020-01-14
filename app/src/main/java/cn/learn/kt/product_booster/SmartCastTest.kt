package cn.learn.kt.product_booster

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

/**
 * Kotlin编译器足够聪明，可以在大多数情况下自动执行类型转换，
 * 包括：1.从可为空的类型到其非可为空的类型的转换。2.从超类型转换为子类型。
 */
fun main() {
    val date: ChronoLocalDate? = LocalDate.now()
    if(date != null) {
        println(date.isLeapYear)
    }

    if(date != null && date.isLeapYear) {
        println("It's a leap year")
    }

    if(date == null || !date.isLeapYear) {
        println("There's no Feb 29 this year...")
    }

    if(date is LocalDate) {
        val month = date.monthValue
        println(month)
    }

}