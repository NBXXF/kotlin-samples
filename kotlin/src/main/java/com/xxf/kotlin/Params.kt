package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    val test2 = test2(b = 2);
    println(test2);
    print(test3(null));
}

fun test3(s:String?):Int?{
    return s?.toInt();
}
/**
 * 参数默认值
 */
fun test2(a: Int = 10, b: Int): Int {
    return a * b;
}