package cn.tedu.day16;

import java.util.Arrays;

public class StringDemo3 {
    public static void main(String[] args) {
        //获取字符串的每个字符
        String s = "qwertyuiop";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");//q w e r t y u i o p
        }
        System.out.println();
//        byte[] getBytes(Charset charset)
//        使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。
        byte[] arr=  s.getBytes();
        for(int i = 0;i< arr.length; i++){
            byte date =  arr[i];
            char q = (char)date;
            System.out.print(q+" ");
        }
        System.out.println();
        //方法 变成char[],遍历char[]
        char[] b = s.toCharArray();
        System.out.println(Arrays.toString(b));
    }
}
