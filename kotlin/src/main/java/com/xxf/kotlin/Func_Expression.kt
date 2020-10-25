package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 * 函数表达式
 */
fun main(args: Array<String>) {
    println(test(1, 3));

    /**
     * 函数表达式2
     */
    var func2 = { a: Int, b: Int -> a + b };
    println(func2(2, 4));

    var func3: (a: Int, b: Int) -> Int = { a, b -> a + b };
    println(func3(3, 5));
}

/**
 * 函数表达式1 ,无显示方法体
 */
fun test(a: Int, b: Int): Int = a + b;