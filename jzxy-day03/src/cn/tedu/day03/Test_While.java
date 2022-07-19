package cn.tedu.day03;

import java.util.Random;
import java.util.Scanner;

/*
 需求：产生一个随机数，与用户输入的数字作比较直到用户猜对
 */
public class Test_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int s = r.nextInt(100);
        System.out.println(s);
        System.out.println("请输入你要猜的数字");

//        while (true) {
//            int i = sc.nextInt();
//            if (s == i) {
//                System.out.println("猜对了" + r);
//                break;
//            }else if (i>s){
//                System.out.println("猜大了");
//                continue;
//            }else if(i<s){
//                System.out.println("猜小了");
//                continue;
//            }
//        }
       do {
            int i = sc.nextInt();
            if (s == i) {
                System.out.println("猜对了" + r);
                break;
            }else if (i>s){
                System.out.println("猜大了");

            }else if(i<s){
                System.out.println("猜小了");

            }
        }while (true);
    }
}
