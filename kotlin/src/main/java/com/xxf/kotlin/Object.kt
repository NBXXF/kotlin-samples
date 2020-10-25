package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {

    var user: User = User("张三", 24);
    user.say();

    var user2: User = User("张三");
    user2.say();

    var teacher: Teacher = Teacher("李四", 24);
    teacher.say();
}

/**
 * 主构造函数
 */
class User(name: String, age: Int) {

    var name: String;
    var age: Int;

    init {
        this.name = name;
        this.age = age;
    }

    /**
     * 次构造函数
     */
    constructor(name: String) : this(name, -1) {
        this.name = name;
    }

    fun say() {
        println("name ${this.name} age:${this.age}")
    }
}


class Teacher {

    var name: String;
    var age: Int;

    /**
     * 无主构造函数 次构造函数写法
     */
    constructor(name: String, age: Int) {
        this.name = name;
        this.age = age;
    }

    fun say() {
        println("name ${this.name} age:${this.age}")
    }
}
