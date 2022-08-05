package cn.tedu.day16;

import java.util.Arrays;
import java.util.Locale;

public class Test_StringDemo2 {
    public static void main(String[] args) {

        String s = new String("hello");
        // char charAt(int index)
        char a = s.charAt(0);
        System.out.println(a);//h

        String b = s.concat("world");//字符串拼接
        System.out.println(b);//helloworld


        //判断s是否以o结尾，返回类型boolean
        //public boolean endsWith(@NotNull String s)
       boolean c = s.endsWith("o");
        System.out.println(c);//true

        System.out.println(s.indexOf("l"));//2获取s中“l”第一次出现的索引
        System.out.println(s.isEmpty());//false
        System.out.println(s.length());//5获取s的长度

//        void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
//        将字符从此字符串复制到目标字符数组。

        System.out.println(s.replace("l","a"));//heaao,把旧的字符串换成新的
         char [] arr=new char[5] ;
        System.out.println(s.toUpperCase());//HELLO
        System.out.println(s.toLowerCase(Locale.ROOT));//hello
        s = " a b c ";
        System.out.println(s);// a b c
        System.out.println(s.trim());//a b c 去掉前后多余空格
        System.out.println(s.matches("qwe"));//判断s 与qwe 是否匹配

        String x = String.valueOf(100);//把其他类型转换为String类型
        System.out.println(x + 1);//1001
        byte[] bs = s.getBytes();//每个字符对应的数字，存放在byte[]中
        System.out.println(Arrays.toString(bs));//[32, 97, 32, 98, 32, 99, 32]
        s = "abldedkf";
        String [] ss = s.split("d");//切割字符串
        System.out.println(Arrays.toString(ss));//[abl, e, kf]
        char [] cs = s.toCharArray();//把字符串里面的每个元素存放在Char数组里面
        System.out.println(Arrays.toString(cs));//[a, b, l, d, e, d, k, f]
        System.out.println(cs);//abldedkf
        System.out.println(s.getBytes());//[B@1540e19d

        String name = "hmm";
        name.hashCode();
        System.out.println(name);
    }
}
