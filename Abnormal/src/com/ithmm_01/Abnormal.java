package com.ithmm_01;

public class Abnormal {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        int arr [] = {1,2,3};
        System.out.println(arr[3]);
    }
}
/*
开始
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3 异常原因
	at com.ithmm_01.Abnormal.method(Abnormal.java:11)// 异常出现的位置
	at com.ithmm_01.Abnormal.main(Abnormal.java:6)

 */
