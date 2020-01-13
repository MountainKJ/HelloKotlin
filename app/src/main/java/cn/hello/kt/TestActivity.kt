package cn.hello.kt

import android.os.Bundle

class TestActivity : BaseActivity() {
    override fun getContentView(): Int {
        return R.layout.activity_main
    }

    fun action(){}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}