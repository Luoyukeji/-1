package com.ithmm_01;

import java.util.ArrayList;
import java.util.List;

//void add(int index,E element)|在集合中指定位置插入指定元素
//E remove(int index)|删除指定索引处的元素，返回被删除的元素
//E set(int index,E element)|修改指定索引处元素，返回被修改的元素
//E get(int index)|返回指定索引处的元素
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add(int index,E element)|在集合中指定位置插入指定元素
        //list.add(0,"hmm");
       // list.add(5,"hm");IndexOutOfBoundsException: Index: 5, Size: 4

        //E remove(int index)|删除指定索引处的元素，返回被删除的元素
        //list.remove(2);

        //E set(int index,E element)|修改指定索引处元素，返回被修改的元素
        //list.set(2,"python");

        ////E get(int index)|返回指定索引处的元素
        //System.out.println(list.get(1));
        //输出集合
        System.out.println(list);
    }
}
