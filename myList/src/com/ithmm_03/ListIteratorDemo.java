package com.ithmm_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 - 通过List集合的ListIterator（）方法得到，所以说它是list集合特有迭代器

>==系列表迭代器，允许程序员按任一方向遍历列表、迭代期间修改列表，并获得迭代器在列表中的当前位置。ListIterator 没有当前元素；它的光标位置 始终位于调用 previous() 所返回的元素和调用 next() 所返回的元素之间。
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> l = new ArrayList<String>();

        //添加元素
        l.add("hello");
        l.add("world");
        l.add("java");

    /*    //通过List集合的ListIterator（）方法得到，所以说它是list集合特有迭代器
        ListIterator<String> li = l.listIterator();
        while(li.hasNext()) {
            String s = li.next();
            System.out.println(s);
        }

        System.out.println("-----------------------");
        // boolean hasPrevious()
        //          如果以逆向遍历列表，列表迭代器有多个元素，则返回 true。
        //ListIterator<String> lt1 = l.listIterator();
        while(li.hasPrevious()) {
            String s1 = li.previous();
            System.out.println(s1);
        }*/

        //获取列表迭代器
        ListIterator<String> li = l.listIterator();
        while(li.hasNext()) {
            String s = li.next();
            if(s.equals("world")){
                li.add("javaee");
            }

        }
        System.out.println(l);

        int [] arr = {1,2,3,4};
        for (int i:arr){
            System.out.println(i);
        }

    }
}
