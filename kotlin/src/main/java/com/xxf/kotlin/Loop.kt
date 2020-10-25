package com.xxf.kotlin

/**
 * @author XGod
 * @describe TODO
 */
fun main(args: Array<String>) {
    var array = 0..10;//[0,10]
    println("total:${array.count()}")
    for (a in array) {
        print("$a,");
    }

    println("\n----------------");
    var array2 = 0 until 10;//[0,10)
    for (b in array2) {
        print("$b,");
    }
    //输出 0,1,2,3,4,5,6,7,8,9,
    println("\n----------------");
    //间隔步长为2 如同i+=2;
    for (c in array2 step 2) {
        print("$c,");
    }
    //输出：0,2,4,6,8,

    println("\n----------------");
    val reversed = array2.reversed();
    println(reversed.toList());
    //输出 [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
}