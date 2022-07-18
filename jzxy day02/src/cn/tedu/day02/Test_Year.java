package cn.tedu.day02;

import java.util.Scanner;

/*
接收用户输入的年份，判断是平年还是瑞年
 */
public class Test_Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要判断的年份： ");
        int year = s.nextInt();
//        if((year%4==0&&year%100!=0)||year%400==0){
//            System.out.println(year+"是闰年");
//        }else{
//            System.out.println(year+"不是闰年");
//        }


        String s1 = ((year%4==0&&year%100!=0)||year%400==0)?"是闰年":"是平年";
        System.out.println(year+s1);
        
    }
}
