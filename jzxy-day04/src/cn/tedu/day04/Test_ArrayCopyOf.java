package cn.tedu.day04;

import java.util.Arrays;

public class Test_ArrayCopyOf {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       //int arr2[]  =  Arrays.copyOf(arr,5);

        //数组扩容
        //int arr3[]  =  Arrays.copyOf(arr,10);
        //System.out.println(Arrays.toString(arr3));

        //数组截取
        int arr4[] = Arrays.copyOfRange(arr,2,4);//(数组名,开始下标，结束下标)截取出来的是
        System.out.println(Arrays.toString(arr4));//含头不含尾

    }
}
