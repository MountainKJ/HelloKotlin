package cn.hello.kt

class User {
    var name: String
    var id: Int
    init {
        name = "张三"
        id = 101
    }
    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

}