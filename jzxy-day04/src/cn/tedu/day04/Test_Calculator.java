package cn.tedu.day04;

import java.util.Scanner;

public class Test_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要选择的算法(1-4)： ");
        int s = sc.nextInt();

        System.out.println("请输入第一个数： ");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数： ");
        double b = sc.nextDouble();
        switch(s){
            case 1:

                System.out.println(a+"+"+b+"="+AddMethod(a,b));
                break;
            case 2:
                System.out.println(a+"+"+b+"="+lessMethod(a,b));
                break;
            case 3:
                System.out.println(a+"+"+b+"="+MultiplyMethod(a,b));
                break;
            case 4:
                System.out.println(a+"+"+b+"="+exceptMethod(a,b));
                break;
            default:
                System.out.println("输入有误");
        }
    }
    public static double AddMethod(double x, double y){
        return x + y;
    }
    public static double lessMethod(double x,double y){
        return x-y;
    }
    public static double MultiplyMethod(double x,double y){
        return x*y;
    }
    public static double exceptMethod(double x,double y){
        return x/y;
    }
}
