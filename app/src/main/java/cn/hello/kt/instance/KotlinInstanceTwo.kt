package cn.hello.kt.instance

/**
 * 懒汉式 doubleCheck
 */
class KotlinInstanceTwo private constructor(){
    companion object{
        val doubleCheckSin : KotlinInstanceTwo by lazy {
            KotlinInstanceTwo()
        }
    }

    fun calculate() {

    }
}