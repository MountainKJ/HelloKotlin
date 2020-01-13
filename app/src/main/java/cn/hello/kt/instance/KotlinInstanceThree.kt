package cn.hello.kt.instance

class KotlinInstanceThree private constructor(){
    companion object{
        val instance = Holder.holder
    }

    private object Holder{
        val holder = KotlinInstanceThree()
    }

    fun calculate() {

    }
}