package cn.learn.kt.classes

//声明一个Customer没有任何属性或用户定义的构造函数的名称类，非参数化的默认构造由Kotlin自动创建
class  Customer
//声明一个具有两个属性的类，不可变的id，可变的email 以及带有两个参数 id和email的构造函数
class Contact(val id: Int, var email: String)
fun  main() {
    //声明一个Customer实例，kotlin无new关键字
    val customer = Customer()

//    val contac2 = Contact()       //编译错误
    //
    val contact = Contact(1, "mary@gmail.com")
//    contact.id = 2        //id 由val声明  不可变
    println(contact.id)
    println("before email = ${contact.email}")
    contact.email = "jane@gmail.com"
    println("after email = ${contact.email}")
}