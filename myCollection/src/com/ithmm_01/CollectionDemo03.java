package com.ithmm_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



// -  boolean hasNext()    如果仍有元素可以迭代，则返回 true。
// - E next()  返回迭代的下一个元素。
//-  void remove()  从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
public class CollectionDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();
        //添加集合元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //public interface Iterator<E>对 collection进行迭代的迭代器。
        Iterator<String> it = c.iterator();

        /*
        public Iterator<E> iterator() {
            return new ArrayList.Itr();

             private class Itr implements Iterator<E> {
             ...
             }
         */
        // - E next()  返回迭代的下一个元素。


//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());//.NoSuchElementException由 Enumeration 的 nextElement 方法抛出，表明枚举中没有更多的元素。



        // -  boolean hasNext()    如果仍有元素可以迭代，则返回 true。
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }
        //用while循环改进
        while(it.hasNext()){
           // System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
        //输出集合
        //System.out.println(c);
    }
}
