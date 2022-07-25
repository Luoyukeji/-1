package com.ithmm_01;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //void add(int index, E element)	在此列表中指定的位置插入指定的元素。
        list.add(2,"王麻子"); //张三   李四  王麻子   王五

        // void addFirst(E e) |  将指定元素插入此列表的开头。
        // void addLast(E e) |  将指定元素添加到此列表的结尾。
        list.addFirst("王麻子");//王麻子 张三 李四 王五
        list.addLast("赵六");//张三 李四 王五 赵六


        //void clear() |从此列表中移除所有元素。
        list.clear();

        //descendingIterator()返回以逆向顺序在此双端队列的元素上进行迭代的迭代器。
//        Iterator<String> li = list.descendingIterator();
//        while(li.hasNext()) {
//            String s = li.next();
//            System.out.print(s+" ");//王五 李四 张三
//        }

        // E get(int index) |返回此列表中指定位置处的元素。

        System.out.println(list.get(2));//王五



//        E remove(int index) |移除此列表中指定位置处的元素。
        list.remove(0);//李四 王五


//        E set(int index, E element) |    将此列表中指定位置的元素替换为指定的元素。
//        int size() |返回此列表的元素数。
        list.set(0,"王麻子");//王麻子 李四 王五

        System.out.println(list.size());//3

       // 通过List集合的ListIterator（）方法得到，所以说它是list集合特有迭代器
// 系列表迭代器，允许程序员按任一方向遍历列表、迭代期间修改列表，并获得迭代器在列表中的当前位置。
// ListIterator 没有当前元素；它的光标位置 始终位于调用 previous() 所返回的元素和调用 next() 所返回的元素之间。

// ListIterator<E> listIterator(int index) |返回此列表中的元素的列表迭代器（按适当顺序），从列表中指定位置开始。
        //获取列表迭代器，遍历集合
        ListIterator<String> li = list.listIterator();
        while(li.hasNext()) {
            String s = li.next();
            System.out.print(s+" ");
        }

    }
}
