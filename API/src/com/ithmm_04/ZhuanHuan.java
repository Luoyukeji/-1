package com.ithmm_04;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class ZhuanHuan {
    public static void main(String[] args) {
        //int--->String
        // 方法一
        int number = 100;
        String i = "" + number;
        System.out.println(i);
        //方法二
        //static String valueOf(int i)
        //          返回 int 参数的字符串表示形式。
        String i1 = String.valueOf(number);
        System.out.println(i1);

        System.out.println("-----------------");

        //String --> Integer -- > int
        String s1 = "100";
        //String --->Integer
        Integer i2 = Integer.valueOf(s1);
        // int intValue()
        //          以 int 类型返回该 Integer 的值。
        int x = i2.intValue();
        System.out.println(x);
        //f方法二
        //static int parseInt(String s)
        //          将字符串参数作为有符号的十进制整数进行解析。
        int y = Integer.parseInt(s1);
        System.out.println(y);

    }
}
