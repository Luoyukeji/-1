package com.ithmm_04;
//

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        String s = "10 2 25 99 36 19";
        String[] s1Array = s.split(" ");//按“ ”分割

      /*  for (int i = 0; i < s1Array.length; i++){
            System.out.println(s1Array[i]);
        }
*/
        int arr[] = new int[s1Array.length];
        for (int i = 0; i < s1Array.length; i++){
            arr[i] = Integer.parseInt(s1Array[i]); //string s1array -- >int
//            System.out.println(arr[i]);
        }
        Arrays.sort(arr);//工具类方法

        //拼接
        StringBuilder sb = new StringBuilder();
        for (int i =0 ;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
