package com.ithmm_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
增强for： 简化数组和Collection集合的遍历==
 -
 - 实现Iterator接口的类允许其对象称为增强for语句的目标
 - 他是JDK5之后出现的，其内部原理就是一个Iterator迭代器


 格式：
   for(元素数据类型  变量名  ：数组或者Collection集合）{
  //在此处使用变量即可，改变量就是元素
}
 */
public class StrongFor {

    public static void main(String[] args) {
       /* int arr[] = {1,2,3,4,5,6};
        for (int i:arr){
            System.out.println(i);
        }*/


        System.out.println("----------------");


        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("Java");
        for (String i:c){
            System.out.println(i);
        }

        System.out.println("---------------");

        List<String> l = new ArrayList<String>();
        l.add("hhh");
        l.add("mmm");
        l.add("mmm");
        for (String i :l){
            System.out.println(i);
        }

        //验证是否内部为迭代器，并发修改异常
//        for(String i :l){
//            if(i.equals("hhh")){
//                l.add("llll");//.ConcurrentModificationException
//            }
//        }

    }
}
