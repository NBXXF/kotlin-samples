package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    var f: Father = Father();
    f.say();
    var s: Father = Child();
    s.say();
}

/**
 * 如果要提供给其他子类实现 必须使用open关键字,代表是公开，kotlin和java相反 默认都是final 不可以继承重新的
 */
open class Father {
    open fun say() {
        println("我是父亲");
    }
}

class Child : Father() {
    override fun say() {
        println("我是孩子");
    }
}