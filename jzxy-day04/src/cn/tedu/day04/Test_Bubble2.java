package cn.tedu.day04;

import java.util.Arrays;
import java.util.Random;

public class Test_Bubble2 {
    public static void main(String[] args) {

        Random r = new Random();
        int arr[] = new int [10];
        for (int j = 0; j < arr.length;j++){
            int i = r.nextInt(100);
            arr[j] = i;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
