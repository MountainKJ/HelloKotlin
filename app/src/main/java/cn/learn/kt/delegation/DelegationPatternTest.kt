package cn.learn.kt.delegation

import java.util.*

/**
 * 委托模式/by 委托对象  不需要样板代码
 */
interface SoundBehavior{            //定义接口
    fun makeSound()
}
class ScreamBehavior(private val n: String): SoundBehavior {            //实现接口
    override fun makeSound() = println("${n.toUpperCase(Locale.getDefault())}！！！")
}

class RockAndRollBehavior(private val n: String): SoundBehavior {       //实现接口
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

class TomAraya(n: String): SoundBehavior by ScreamBehavior(n)       //也实现了接口 委托给Scream。。

class ElvisPresley(n: String): SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}