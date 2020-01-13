package cn.learn.kt.special

/**
 * 枚举类用于对表示有限的一组不同值的类进行建模  例如方向、状态、模式等
 */
fun main() {
    val state = STATE.FINISHED
    val message = when(state) {         //使用枚举  编译器可以推断是否已经穷举  不需要else
        STATE.IDLE -> "闲置状态"
        STATE.RUNNING -> "运行状态"
        STATE.FINISHED -> "完成状态"
    }

    println(message)

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
}

enum class STATE{
    IDLE, RUNNING,FINISHED
}

//枚举可能包含与其他类一样的属性和方法，用“;”将其与实例表分开即可
enum class Color(val rgb: Int) {
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff),
    YELLOW(0xffff00);

    fun containsRed() = (this.rgb and 0xff0000 != 0)
}

