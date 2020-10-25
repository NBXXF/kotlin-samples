package com.xxf.kotlin

fun main(args: Array<String>) {
    test(null);
}

fun test(arg:String?): String {
    return arg+arg;
}