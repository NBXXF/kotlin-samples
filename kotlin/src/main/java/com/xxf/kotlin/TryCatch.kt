package com.xxf.kotlin

import java.lang.Exception

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    var s: String = "xx";
    try {
        s.toInt();
    } catch (e: Exception) {
        e.printStackTrace();
        println("出现异常:" + e);//出现异常:java.lang.NumberFormatException: For input string: "xx"
    }

}