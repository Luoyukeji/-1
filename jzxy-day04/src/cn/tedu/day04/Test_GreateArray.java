package cn.tedu.day04;

import java.util.Arrays;

/*
数组
*/
public class Test_GreateArray {
    public static void main(String[] args) {
        char [] c1 = {'h','e','l','l','o'};
        char [] c2 = new char[]{'h','e','l','l','o'};
        for (int i = 0; i <c2.length;i++){
            //c2[i] = 's';
            System.out.println(c2[i]);

        }

        System.out.println(Arrays.toString(c2));


        String s1 [] =new String[3];
        String s2[] =new String[]{"h","e","l","l","o"};
         /**
         * char底层做了处理，可以直接打印数组中的内容
         * 除了char类型外的所有数组想要查看数组中的具体元素
         * 需要实用工具类Arrays的to String()方法
         */
    }
}
