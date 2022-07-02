package com.ithmm_04;

public class IntegerDemo {
    public static void main(String[] args) {
        //构造方法摘要
//Integer(int value)
//          构造一个新分配的 Integer 对象，它表示指定的 int 值。
//Integer(String s)
//          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
//
        Integer i = new Integer(100);
        System.out.println(i);

        Integer i1 = new Integer("1000");//由数字组成的字符串
        System.out.println(i1);

        //static Integer valueOf(int i)
        //          返回一个表示指定的 int 值的 Integer 实例。
        //static Integer valueOf(String s)
        //          返回保存指定的 String 的值的 Integer 对象。
        Integer i2 = Integer.valueOf(10);
        System.out.println(i2);

        Integer i3 = Integer.valueOf("10000");
        System.out.println(i3);

    }
}
