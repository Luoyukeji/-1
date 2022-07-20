package cn.tedu.day04;

import java.util.Arrays;
import java.util.Random;

/*
输出一年每个月份的天数
 */
public class Test_Arrays1 {
    public static void main(String[] args) {


        method();
//        int arr [] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(i+1+"月"+arr[i]+"天");
//        }

//        int arr[]=new int[10];
//        for(int i = 0; i < arr.length; i++) {
//            Random r = new Random();
//           int s = r.nextInt(10000);//[0,10000)
//            arr[i] =  s;
//            System.out.println(arr[i]);
//        }
//        System.out.println(Arrays.toString(arr));
    }
    public static void method(){
        int arr[]=new int[10];
        for(int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int s = r.nextInt(10000);//[0,10000)
            arr[i] =  s;
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
