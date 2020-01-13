package cn.hello.kt

import android.app.Activity
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

open class MainActivity : AppCompatActivity(),Impl,View.OnClickListener {

    lateinit var view: View                 //lateinit 延迟初始化 编译器不会帮你检查
    lateinit var rootLayout: LinearLayout
    var milkeDesc = "This is a Milk"        //类型推断  可以不用声明变量类型
    val size = 18                           //val 只读变量类型，只能赋值一次，不可修改 类final
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view = findViewById(R.id.act_main_test_tv)
        getId(view)
        rootLayout = findViewById(R.id.act_main_test_layout)
        view.setOnClickListener(View.OnClickListener {
            rootLayout.background = ColorDrawable(Color.CYAN)
            rootLayout.setPadding(0,0,0,0)
        })
    }

    fun getId(v: View?) {
        Log.e("MainActivity", "id = "+v!!.id)
    }

    override fun onResume() {
        super.onResume()
        Log.e("xx", " 123")
    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
