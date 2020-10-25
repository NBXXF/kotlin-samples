package com.xxf.kotlin
fun main(args: Array<String>) {
    println("hello");
    println(MyFunc(10));
    println(check(11));

    var phone="小米";
    var phoneNumber="176****9080";
    var str="我的手机品牌$phone 电话号码是${phoneNumber}";
    println(str);

    println("我的手机号是${getMyPhoneNum()}");//输出：我的手机号是176****9080


    var a="hello";
    var b="hello";
    println(a==b);
    println(a.equals(b));
}

fun getMyPhoneNum():String{
    return "176****9080";
}


fun MyFunc(a: Int): Int {
    return a * 2;
}

fun check(a: Int): Boolean {
    return a > 10;
}