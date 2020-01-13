//平等检查
//Kotlin ==用于结构比较和 ===参考比较
//更准确的说， a==b 编译为 a== null ? b == null : a.equals(b)
fun main() {
    val authors = setOf("莎士比亚","海明威", "吐温")
    val writers = setOf("吐温", "莎士比亚", "海明威")

    println(authors == writers)
    println("作者"==="作者")

}