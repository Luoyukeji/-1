package cn.tedu.day03;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("请输入今天的星期数： ");
        int week = sc.nextInt();

            switch (week) {
                case 1:
                    System.out.println("星期一学java");
                    break;
                case 2:
                    System.out.println("星期二学语文");
                    break;
                case 3:
                    System.out.println("星期三学数学");
                    break;
                case 4:
                    System.out.println("星期四学英语");
                    break;
                case 5:
                    System.out.println("星期五打游戏");
                    break;
                case 6:
                    System.out.println("星期六去游泳");
                    break;
                case 7:
                    System.out.println("星期日去爬山");
                    break;//默认
                default:
                    System.out.println("输入的星期数有误，请重新输入");
            }
        }
    }
}
