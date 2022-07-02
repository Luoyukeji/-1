package com.ithmm_01;

public class MathDemo {
    public static void main(String[] args) {
        //    public static int abs(int a) 返回参数的绝对值
        System.out.println(Math.abs(-52));
        System.out.println(Math.abs(22));
//    public static double ceil(double a) 返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.24));
        System.out.println(Math.ceil(-12.33));
//    public static double floor(double a 返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(11.25));
        System.out.println(Math.floor(11.99));
//            public static int round(float a) 按照四舍五入返回最接近参数的int
        System.out.println(Math.round(30.65F));
        System.out.println(Math.round(29.49F));
//    public static int max(int a,int b) 返回两个int值中的较大值
        System.out.println(Math.max(111,999));
//    public static int min(int a,int b) 返回两个int值中的较小值
        System.out.println(Math.min(111,999));
//    public static double pow(double a,double b)返回a的b次幂的值
        System.out.println(Math.pow(2,2));
//    public static double random() 返回值为double的正值，[0.0,1.0)
        System.out.println(Math.random());

    }

}
