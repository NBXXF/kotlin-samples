package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    var f: Father3 = Father3("炫神");
    f.say();
    var s: Father3 = Child3("小炫");
    s.say();

    var s1: Father3 = Child3_1("小炫");
    s.say();
}

/**
 * 如果要提供给其他子类实现 必须使用open关键字,代表是公开，kotlin和java相反 默认都是final 不可以继承重新的
 */
open class Father3 {
    var name: String;

    constructor(name: String) {
        this.name = name;
    }

    open fun say() {
        println("我是父亲,my name is ${this.name}");
    }
}

class Child3 : Father3 {
    constructor(name: String) : super(name);
    override fun say() {
        println("我是孩子,my name is ${this.name}");
    }
}

class Child3_1(name: String) : Father3(name) {
    override fun say() {
        println("我是孩子,my name is ${this.name}");
    }
}