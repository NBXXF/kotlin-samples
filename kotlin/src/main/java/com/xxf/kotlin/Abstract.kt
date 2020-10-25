package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    var person: Species = P();
    person.hobby();

    var p:Species= Panda();
    p.hobby();
}

abstract class Species {
    abstract fun hobby();
}

class P : Species() {
    override fun hobby() {
        println("我的爱好是吃喝玩乐");
    }
}

class Panda : Species() {
    override fun hobby() {
        println("我的爱好是吃竹子");
    }

}
