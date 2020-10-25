package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    var f: Father2 = Father2("炫神");
    f.say();
    var s: Father2 = Child2("小炫");
    s.say();
}

/**
 * 如果要提供给其他子类实现 必须使用open关键字,代表是公开，kotlin和java相反 默认都是final 不可以继承重新的
 */
open class Father2(name: String) {
    var name: String;

    init {
        this.name = name;
    }

    open fun say() {
        println("我是父亲,my name is ${this.name}");
    }
}

class Child2(name:String) : Father2(name) {
    override fun say() {
        println("我是孩子,my name is ${this.name}");
    }
}