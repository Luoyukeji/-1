package com.ithmm_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/*
Java中的异常被分为两大类：==编译时异常和运行时异常==，也称为==受检异常和非受检异常==
 **编译时异常:** 最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。
**必须显示处理，否则程序就会发生错误，无法通过编译**
- **运行时异常：** 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
**无需显示处理，也可以和编译异常一样处理**
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        method1();
    }
    //编译时异常
    public static void method1(){
        try {
            String s = "2022-06-20";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date p = sdf.parse(s);
            System.out.println(p);
        }catch(ParseException e){
            e.printStackTrace();
        }

    }
    //运行时异常
//    public static void method(){
//        try {
//            int arr[] = {1, 2, 3};
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException: 3
//        }catch(ArrayIndexOutOfBoundsException e){
//           e.printStackTrace();
//        }
//    }
}
