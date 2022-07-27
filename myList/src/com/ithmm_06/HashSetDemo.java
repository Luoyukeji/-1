package com.ithmm_06;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet集合特点
 *
 * 底层数据结构是哈希表
 * 对集合的迭代顺序不做任何的保证，也就是说不保证存储和取出的元素顺序一致
 * 没有带索引的方法，所以不能使用普通for循环来遍历（可以使用迭代器和增强for遍历）
 * 由于是Set 集合，所以不包含重复元素的集合
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");

//        hs.add("hello");


        //遍历
        for(String s:hs){
            System.out.println(s);//world java  hello
        }
        //迭代器  Iterator<E> iterator()
        //          返回对此 set 中元素进行迭代的迭代器
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
    }
}
