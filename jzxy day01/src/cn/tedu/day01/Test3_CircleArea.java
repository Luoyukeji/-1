package cn.tedu.day01;

import java.util.Scanner;

//求圆的面积
public class Test3_CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入所求圆的半径 d = ");

        double d = scanner.nextDouble();
        double s ;
        s= 3.14*d*d;
        System.out.println(s);

    }
}
