package com.ithmm_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set 集合的特点**
 - 不包含重复元素的集合
 - 没有带索引的方法，所以不能使用普通for循环遍历
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建集合类对象
        //因为Set是一个接口，不能直接实例化，所以这里要用到他的实现类，HashSet,它对集合的迭代顺序不作任何保证
        Set<String> s  = new HashSet<String>();
        s.add("张三");//没有带索引的add方法
        s.add("李四");
        s.add("王五");

        //遍历
        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        //增强For
//        for( String s1 : s){
//            System.out.println(s1);
//        }
//
    }
}
