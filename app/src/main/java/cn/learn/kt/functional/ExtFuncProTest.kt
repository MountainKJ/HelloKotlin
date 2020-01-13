package cn.learn.kt.functional

/**
 * kotlin允许您使用扩展机制将新成员添加到任何类，  扩展有两种类型：扩展功能和扩展属性。您需要指定扩展类型即可
 */
fun main() {
    val order = Order(listOf(Item("张三", 25.0f), Item("李四", 20f), Item("王五", 21f)))

    println("Max priced item name :${order.maxpriceItemName()}")
    println("Max priced item value :${order.maxpricedItemValue()}")         //实例上调用扩展功能
    println("Items: ${order.commaDelimitedItemNames}")                      //实例上调用扩展属性
    val orders = null
    println(orders.nullSafeToString())
}
data class Item(val name: String, val price: Float)     //定义简单模型 Item和Order。 Order可以包含Item对象的集合

data class Order(val items:Collection<Item>)

fun Order.maxpricedItemValue(): Float = this.items.maxBy { it.price } ?.price ?: 0F     //为该Order类型的扩展功能

fun Order.maxpriceItemName(): String = this.items.maxBy { it.price}?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String get() = items.map { it.name }.joinToString()  //为该Order类型 添加属性

//对null引用执行扩展，在扩展功能中，您可以检查对象null并在代码中使用结果
fun <T> T ?. nullSafeToString() = this?.toString() ?: "Null"




