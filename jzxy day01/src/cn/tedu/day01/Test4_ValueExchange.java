package cn.tedu.day01;

import java.util.Scanner;

/**
 * 变量交换
 * 接收用户输入的两个值，假设a=1；b=2；交换ab；
 */
public class Test4_ValueExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数a =  ");
        int a = sc.nextInt();
        System.out.println("请输入第二个数b =  ");
        int b= sc.nextInt();
        //创建临时变量
        int temp;
        temp = a;
        a= b;
        b= temp;
        System.out.println("交换后：");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
