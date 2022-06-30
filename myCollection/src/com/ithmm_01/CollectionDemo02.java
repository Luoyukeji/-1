package com.ithmm_01;

import java.util.ArrayList;
import java.util.Collection;

//boolean add(E e) |确保此 collection 包含指定的元素（可选操作）。
//  boolean remove(Object o) |从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
//   void clear() |移除此 collection 中的所有元素（可选操作）。
//   boolean contains(Object o) |如果此 collection 包含指定的元素，则返回 true。
// boolean isEmpty() |如果此 collection 不包含元素，则返回 true。
// int size() |返回此 collection 中的元素数。 集合长度
public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();
        //boolean add(E e) |确保此 collection 包含指定的元素（可选操作）。
//        System.out.println(c.add("hmm"));
//        System.out.println(c.add("20"));
//        System.out.println(c.add("大一"));
        //调用c.add 方法返回都是true
        c.add("hello");
        c.add("world");
        c.add("java");


        //  boolean remove(Object o) |从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
        //System.out.println(c.remove("world"));

        //   void clear() |移除此 collection 中的所有元素（可选操作）。
       // c.clear();

        //   boolean contains(Object o) |如果此 collection 包含指定的元素，则返回 true。
        //System.out.println(c.contains("world"));
        //System.out.println(c.contains("hmm"));

        // boolean isEmpty() |如果此 collection 不包含元素，则返回 true。
        System.out.println(c.isEmpty());

        //// int size() |返回此 collection 中的元素数。 集合长度
        System.out.println(c.size());
        //输出集合对象
        System.out.println(c);
    }
}
