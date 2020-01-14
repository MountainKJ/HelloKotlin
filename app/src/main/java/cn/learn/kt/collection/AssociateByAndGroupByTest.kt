package cn.learn.kt.collection

fun main() {

    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

    println("---------------------people.associateBy---it.phone-------------------------------")
    val phoneBook = people.associateBy { it.phone }
    println(phoneBook)

    val cityBook = people.associateBy(Person::phone, Person::city)
    println("---------------------people.associateBy----------------------------------")
    println(cityBook)

    println("-----------------------people.groupBy--------------------------------")
    val peopleCities = people.groupBy(Person::city, Person::name)
    println(peopleCities)
}