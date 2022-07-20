package cn.tedu.day04;

import java.util.Arrays;
import java.util.Random;

/*
 冒泡排序
 */
public class Test_Bubble {
    public static void main(String[] args) {
       // int arr[] = {20, 5, 7, 88, 71, 5, 63, 2};

        Bubble();
        //System.out.println(Arrays.toString(arr));
    }
    public static void  Bubble(){
//        int arr[] = new int[10];

//        Random r = new Random();//应该在循环里，产生一个附一个值
//         int s = r.nextInt(1000);

//         for (int ii = 0 ;ii<arr.length;ii++){
//             arr[ii] = s;
//         }
        int arr[]=new int[10];
        for(int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int s = r.nextInt(10000);//[0,10000)
            arr[i] =  s;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length-1 ; j++) {//外层循环，控制比较的轮数，假设n个数，最多比较n-1次
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println("第"+(j+1)+"轮："+Arrays.toString(arr));
        }
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
