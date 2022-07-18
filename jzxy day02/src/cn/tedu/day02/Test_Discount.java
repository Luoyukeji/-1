package cn.tedu.day02;

import java.util.Scanner;

/**
 * 需求:接收用户输入的原价满1000打9折；满2000打8折；满5000打5折
 */
public class Test_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户的商品原价： ");
        int x = sc.nextInt();
        if(x>=1000&&x<2000){
           double d = x*0.9;
            System.out.println("打折后为：  "+d+"元");
        }else if (x>=2000&&x<5000){
            double d =x *0.8;
            System.out.println("打折后为：  "+d+"元");
        }else if (x>=5000){
            double d = x *0.5;
            System.out.println("打折后为：  "+d+"元");
        }else{
            System.out.println("未满足打折价钱");
        }
    }
}
