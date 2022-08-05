package cn.tedu.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 再抛出异常的时候可以使用多态，不管是什么异常，统统被Exception抛出去
 */
public class Exception2 {

    public static void main(String[] args) {


        method1();
        try {
            method();

        }catch (Exception e) {
            e.printStackTrace();//ArithmeticException: / by zero
//            .InputMismatchException输入不匹配异常
        }
    }

    public static void method(){
        System.out.println("请输入你要计算的第一个数字");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a/b);


    }

    public static void method1() throws ArithmeticException, InputMismatchException {
        System.out.println("请输入你要计算的第一个数字");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a/b);
    }


}
