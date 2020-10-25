package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    var day = 2;
    var res=when (day) {
        1 -> "星期一";
        2 -> "星期二";
        3 -> "星期三";
        4 -> "星期四";
        5 -> "星期五";
        6 -> "星期六";
        7 -> "星期日";
        else -> "其他";
    };
    print(res);
}